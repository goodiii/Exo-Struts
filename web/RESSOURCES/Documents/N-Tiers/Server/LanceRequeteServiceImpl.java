import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.rmi.PortableRemoteObject;

public class LanceRequeteServiceImpl extends PortableRemoteObject implements LanceRequeteService { 

	// Implementations must have an explicit constructor 
	// in order to declare the RemoteException exception 

	public LanceRequeteServiceImpl() throws RemoteException { super(); } 

    public String executeQuery() throws RemoteException, ClassNotFoundException, SQLException {
		Connection con;
		Statement stmt;
		ResultSet test;
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/mysql?user=root&password=/";

        Class.forName("org.gjt.mm.mysql.Driver");
        con = DriverManager.getConnection(url, username, password);
        stmt = con.createStatement();
        System.out.println(con);
        System.out.println(stmt);
        System.out.println("La connexion a SQL est etablie");
		test = stmt.executeQuery("SELECT * FROM emp");
		ResultSetMetaData rsmd = test.getMetaData();
		test.first();
		String label_empno = test.getString("empno");
		
		return label_empno;
		
    }
    
} 
