package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.struts.action.ActionForm;

public class SerialBean extends ActionForm {

//	private SerialBean frere = null;
    private String nom = "";
    private String prenom = "";
    private int taille = 0;

    public SerialBean() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static void serialiser(SerialBean serial) throws FileNotFoundException, IOException {

        /*		SerialBean p2 = new SerialBean("Dupond","Paul",180);
         SerialBean p3 = new SerialBean("Dupond","Jacques",170);
         p1.frere = p2;
         p2.frere = p3; */

        FileOutputStream fichier = new FileOutputStream("personne.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fichier);
        oos.writeObject(serial);
        oos.flush();
        oos.close();
        System.out.println("L'objet a ete serialisé");

    }

    public static void deserialiser(String deserialiser) throws FileNotFoundException, IOException, ClassNotFoundException {

        FileInputStream fichier = new FileInputStream(deserialiser);
        ObjectInputStream ois = new ObjectInputStream(fichier);
        SerialBean personne = (SerialBean) ois.readObject();
        
     /*  while (personne != null) {
            System.out.println("Personne : ");
            System.out.println("nom : " + personne.getNom());
            System.out.println("prenom : " + personne.getPrenom());
            System.out.println("taille : " + personne.getTaille());
        //    personne = personne.frere;
        }
   */ }
}
