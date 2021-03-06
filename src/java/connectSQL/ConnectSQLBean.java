/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

/**
 *
 * @author user
 */
public class ConnectSQLBean extends ActionForm {

    private static Connection con;
    private static Statement stmt;
    private static String requete;
    private static ResultSet result;
    private static int row;

    public ConnectSQLBean() {
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

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.row = 0;
        this.result = null;
        this.requete = null;
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

    public static int requete(String requete) throws SQLException {
        result = stmt.executeQuery(requete);
        result.first();
        row = result.getRow();
        return row;
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

    public String getRequete() {
        return requete;
    }

    public void setRequete(String requete1) {
        requete = requete1;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row1) {
        row = row1;
    }
}
