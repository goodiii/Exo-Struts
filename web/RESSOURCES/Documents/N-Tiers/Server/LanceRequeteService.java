import java.rmi.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author user
 */
public interface LanceRequeteService extends Remote{

    /**
     * @param args the command line arguments
     */
    public String executeQuery() throws RemoteException, ClassNotFoundException, SQLException;
        // TODO code application logic here
    }