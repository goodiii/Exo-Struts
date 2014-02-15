import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class LanceRequeteServiceClient {

    public static void main(String[] args) throws Exception {

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.cosnaming.CNCtxFactory");
        env.put(Context.PROVIDER_URL, "iiop://localhost:1049");
        Context ctx = new InitialContext(env); // JNDI

        Object objref = (LanceRequeteService) ctx.lookup("requete"); 
		
        LanceRequeteService c = (LanceRequeteService) PortableRemoteObject.narrow(objref, LanceRequeteService.class);

        System.out.println(c.executeQuery());

    }
}
