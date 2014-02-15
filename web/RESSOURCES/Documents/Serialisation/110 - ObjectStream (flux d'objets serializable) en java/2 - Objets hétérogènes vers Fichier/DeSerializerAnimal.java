import java.io.*;

public class DeSerializerAnimal {

	public static void main(String argv[]) throws Exception {
		try {
			FileInputStream fichier = new FileInputStream("animal.ser");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			while (true) {
				Animal a = (Animal) ois.readObject(); // le deserializer doit absolument connaitre les classes.
				a.chanter();
			}
		} catch (EOFException e) {}
	}
}
