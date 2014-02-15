import java.io.*;
import java.util.*;
   
public class SerializerAnimal {
   
	public static void main(String argv[]) throws Exception {
		FileOutputStream fichier = new FileOutputStream("animal.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fichier);

		Random r = new Random();
		Date date=new Date();
		r.setSeed((long)date.getTime());

		Animal a = null;
		for(int i=0;i<10;i++){
            	int n= r.nextInt(4);
			switch (n) {
				case 0 : a= new Chien(); break;
				case 1 : a= new Chat(); break;
				case 2 : a= new Canard(); break;
				case 3 : a= new Corbeau(); break;
			}
			oos.writeObject(a); // on serialize des animaux aléatoirement 1 par 1, les uns à la suite des autres dans le mm fichier
		}
		oos.close();
	}
}
