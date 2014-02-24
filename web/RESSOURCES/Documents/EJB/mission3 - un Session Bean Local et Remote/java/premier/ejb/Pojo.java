package premier.ejb;

class Pojo {
	static int compteur = 0;
	static int fac(int n) {
		int r = 1;
		for (;n>1;n--) r*=n;
		return r;
	}
	static int fibo(int n) {
		int fibo_n = 1;
		int fibo_nplus1 = 1;
		for (int i=0; i<n; i++) {
			int tampon = fibo_n;
			fibo_n = fibo_nplus1;
			fibo_nplus1 += tampon;
		}
		return fibo_n;
	}
	static int incremente() {
		return ++compteur;
	}
}
