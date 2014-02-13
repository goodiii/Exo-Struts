/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.struts.action.*;

/**
 *
 * @author user
 */
public class ConnectSQL extends ActionForm {

    private static Connection con;
    private static Statement stmt;
    
    public ConnectSQL() {
    }

    public static void connexion() throws ClassNotFoundException, SQLException {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/mysql?user=root&password=/";

        Class.forName("org.gjt.mm.mysql.Driver");
        con = DriverManager.getConnection(url, username, password);
        con.setAutoCommit(false);
        stmt = con.createStatement();
        System.out.println(con);
        System.out.println(stmt);
        System.out.println("La connexion a SQL est etablie");
    }

    public static void close() throws SQLException {
        stmt.close();
        con.close();
        stmt = null;
        con = null;
        System.out.println("La connexion a SQL a ete fermee");
    }

    public static void commit() throws SQLException {
        con.commit();
        System.out.println("Commit");
    }

    public static void rollback() throws SQLException {
        con.rollback();
        System.out.println("Rollback");
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con1) {
        con = con1;
    }
        
    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt1) {
        stmt = stmt1;
    }
    
    
}
