
import java.util.Properties;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.naming.*;		
import ejb.StatelessInterface;

public class ClientStateless {

	public static void main(String[] args) throws Exception {

		Properties prop=new Properties();
		prop.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
		prop.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
		prop.put(Context.PROVIDER_URL,"jnp://localhost:1099");

		Context ctx=new InitialContext(prop);
			
		StatelessInterface stub =(StatelessInterface) ctx.lookup("StatelessEJB/remote");
		System.out.println(stub.incremente());
		System.out.println(stub.incremente());
		System.out.println(stub.incremente());
		System.out.println(stub.incremente());
		
	}
}
