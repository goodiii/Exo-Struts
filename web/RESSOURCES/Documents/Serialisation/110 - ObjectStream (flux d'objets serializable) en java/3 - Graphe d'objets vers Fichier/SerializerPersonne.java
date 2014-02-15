import java.io.*;
   
public class SerializerPersonne {
   
	public static void main(String argv[]) throws Exception {

		Personne p1 = new Personne("Dupond","Pierre",175);
		Personne p2 = new Personne("Dupond","Paul",180);
		Personne p3 = new Personne("Dupond","Jacques",170);
		p1.frere = p2;
		p2.frere = p3;

		FileOutputStream fichier = new FileOutputStream("personne.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fichier);
		oos.writeObject(p1);
		oos.flush();
		oos.close();
	}
}
