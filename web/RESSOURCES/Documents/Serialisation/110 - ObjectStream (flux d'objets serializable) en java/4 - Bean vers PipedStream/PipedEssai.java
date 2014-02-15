import java.io.*;

class Producteur extends Thread {
	PipedOutputStream sortie;
	ObjectOutputStream boutPourEcrireObjet;

	public Producteur(PipedOutputStream sortie) {
		super();
		this.sortie = sortie;
		try {
			boutPourEcrireObjet = new ObjectOutputStream(sortie);
		} catch (Exception e) { e.printStackTrace(); }
	}

	public void run(){
		try {
			for( int k = 0; ; k++){
				System.out.println("Producteur ecrit dans le pipe >>> " + k);
				Personne personne = new Personne("Dupond","Jean",k);
				boutPourEcrireObjet.writeObject(personne);
				boutPourEcrireObjet.flush();
				if (k==100) Thread.currentThread().sleep(10000);
			}
		}
		catch (IOException e) { e.printStackTrace(); }
		catch (Exception e) { }
	}
}


class Consommateur extends Thread {
	PipedInputStream entree;
	ObjectInputStream boutPourLireObjet;

	public Consommateur(PipedInputStream entree) {
		super();
		this.entree = entree;
		try {
			boutPourLireObjet = new ObjectInputStream(entree);
		} catch (Exception e) {}
	}

	public void run(){
		Personne p;
		try {
			while ( true ) {
				p = (Personne) boutPourLireObjet.readObject();
				System.out.println("Consommateur lit dans le pipe <<< " + p.getNom() + " " + p.getPrenom() + " " +p.getNumero());
			}
		}
		catch (IOException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) {}
		catch (Exception e) {}
	}
}

class ObservateurThread extends Thread {
	Consommateur conso;
	Producteur prod;
	public ObservateurThread(Consommateur c, Producteur p) {
		super(); conso=c; prod=p;
	}
	public void run() {
		try {
			while (true) {
				System.out.println("conso " + conso.getState() + "\tprod\t" + prod.getState());
				Thread.currentThread().sleep(100);
			}
		}
		catch (Exception e) {}
	}
}

public class PipedEssai {
	public static void main(String args[]) throws Exception {

		try {
			PipedOutputStream boutPourEcrire = new PipedOutputStream();
			PipedInputStream  boutPourLire = new PipedInputStream(boutPourEcrire);
			Producteur prod = new Producteur(boutPourEcrire);
			Consommateur conso = new Consommateur(boutPourLire);
			ObservateurThread ot = new ObservateurThread(conso, prod);
			ot.start();
			prod.start();
			Thread.sleep(10000);
			conso.start();
			Thread.sleep(100);
		}
		catch (IOException e) {         
			e.printStackTrace();
		}
	}
}

