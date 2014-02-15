import java.io.*;

class ProcessusPere {
	public static void main(String[] args) throws Exception {
		Process proc = Runtime.getRuntime().exec("java ProcessusFils");
		ObjectInputStream ois = new ObjectInputStream(proc.getInputStream());
		while (true) {
			System.in.read();
			Personne p = (Personne) ois.readObject();
			System.out.println(p.date.getMinutes() + "\t" + p.date.getSeconds() + "\t" + p.getNom() + "\t" + p.getPrenom() + "\t" + p.getTaille());
		}
	}
}
