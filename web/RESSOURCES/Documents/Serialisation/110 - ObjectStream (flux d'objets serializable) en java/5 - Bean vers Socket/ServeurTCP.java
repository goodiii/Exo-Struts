import java.io.*;
import java.net.*;

public class ServeurTCP {

	public static void main(String[] args) throws Exception {

		int port = args.length>0 ? Integer.parseInt(args[0]) : 1000;
		ServerSocket s = new ServerSocket(port);
		Socket soc = s.accept();

		ObjectInputStream fluxLectureObject = new ObjectInputStream(soc.getInputStream());

		while (true) {
			Personne p = (Personne) fluxLectureObject.readObject();
			System.out.println("ServeurTCP lit sur la socket <<< " + p.getNom() + " " + p.getPrenom() + " " +p.getNumero());
		}
   }
}
