import java.io.*;

class ProcessusFils {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(System.out);

		for (int i=0; ; i++) {
			Personne p = new Personne("Durand"+i,"Marie",165);
			oos.writeObject(p);
//			oos.flush();
		}
//		oos.flush();
	}
}
