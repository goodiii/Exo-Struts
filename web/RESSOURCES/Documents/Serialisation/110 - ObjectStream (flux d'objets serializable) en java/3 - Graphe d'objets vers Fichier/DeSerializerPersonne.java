import java.io.*;

public class DeSerializerPersonne {

	public static void main(String argv[]) throws Exception {
		FileInputStream fichier = new FileInputStream("personne.ser");
		ObjectInputStream ois = new ObjectInputStream(fichier);
		Personne personne = (Personne) ois.readObject();
		while (personne != null) {
			System.out.println("Personne : ");
			System.out.println("nom : "+personne.getNom());
			System.out.println("prenom : "+personne.getPrenom());
			System.out.println("taille : "+personne.getTaille());
			personne = personne.frere;
		}
	}
}
