package premier.ejb;

import javax.ejb.Stateless;

@Stateless
public class PremierEJB implements PremierLocal, PremierRemote {

	public int fac(int n) { return Pojo.fac(n); }
	public int fibo(int n) { return Pojo.fibo(n); }
	public int incremente() { return Pojo.incremente(); }
}
