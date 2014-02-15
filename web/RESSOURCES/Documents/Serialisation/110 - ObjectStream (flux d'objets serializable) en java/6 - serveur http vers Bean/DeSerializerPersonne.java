import java.io.*;
import java.net.*;

public class DeSerializerPersonne {

	public static void main(String argv[]) throws Exception {
		URL url = new URL("http://localhost:80/personne.ser");
		ObjectInputStream ois= new ObjectInputStream(url.openStream());

		Personne personne = (Personne) ois.readObject();
		System.out.println("nom : "+personne.getNom());
		System.out.println("prenom : "+personne.getPrenom());
		System.out.println("taille : "+personne.getTaille());
	}
}
