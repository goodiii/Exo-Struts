import java.io.*;
import java.net.*;

public class ClientTCP {

   public static void main(String[] args) throws Exception {

		String site = args.length>0 ? args[0] : "localhost"; 
		int port = args.length>1 ? Integer.parseInt(args[1]) : 1000;
		Socket socket = new Socket(site, port);

        	System.out.println("SOCKET = " + socket);

		ObjectOutputStream fluxEcritureObjet = new ObjectOutputStream(socket.getOutputStream());
	
		for( int k = 0; ; k++){	
			Personne personne = new Personne("Dupond","Jean",k);
			fluxEcritureObjet.writeObject(personne);
			System.out.println("ClientTCP ecrit sur la socket >> " + k );
		}
   }
}
