import java.util.*;
import javax.naming.*;

public class LanceRequeteServiceServer {

    public static void main(String args[]) throws Exception {

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.cosnaming.CNCtxFactory");
        env.put(Context.PROVIDER_URL, "iiop://localhost:1049");
        Context ctx = new InitialContext(env);

        LanceRequeteService c = new LanceRequeteServiceImpl();
        ctx.rebind("requete", c);
    }
}
