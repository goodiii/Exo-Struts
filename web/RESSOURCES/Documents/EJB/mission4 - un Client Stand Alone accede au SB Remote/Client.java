
import java.util.Properties;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.naming.*;		
import premier.ejb.Premier;

public class Client {

	public static void main(String[] args) throws Exception {

		System.out.println("tapez l'ip du registry"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String host = br.readLine();

		Properties prop=new Properties(); // coordonnees du registry iiop situé dans le server Jboss
		prop.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
		prop.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");
		prop.put(Context.PROVIDER_URL,"jnp://"+host+":1099");

		Context ctx=new InitialContext(prop); // on met toute les coordonnées dans le contexte
			
		System.out.println("\n========================================");
		NamingEnumeration list = ctx.list(""); // joue le role de filtre, recupere tout
		while (list.hasMore()) {
		    NameClassPair nc = (NameClassPair) list.next();
		    System.out.println(nc);
		}
		System.out.println("========================================");

		Premier prem=(Premier) ctx.lookup("PremierEJB/remote"); // on recupere le stub remote associé au nom "PremierEJB/remote"
		System.out.println("fac(5)=" + prem.fac(5));
		System.out.println("fibo(5)=" + prem.fibo(5));
		System.out.println("incremente()=" + prem.incremente());
		System.out.println("incremente()=" + prem.incremente());
		System.out.println("incremente()=" + prem.incremente());
	}
}
