package ear.ejb.stateless;

import javax.ejb.Stateless;
import ear.pojo.Pojo2;

@Stateless
public class StatelessSessionBean implements StatelessInterfaceLocal, StatelessInterfaceRemote {

	int total = 0;

	static {
		System.out.println("class StatelessSessionBean loadee");
	}

	public StatelessSessionBean() {
		super();
		System.out.println("un StatelessSessionBean cree");
	}

	protected void finalize() throws Throwable {
		System.out.println("un StatelessSessionBean disparait");
		super.finalize();
	}

	public int fac(int n) { return Pojo2.fac(n); }
	public int fibo(int n) { return Pojo2.fibo(n); }
	public int incremente(int n) {
		total += n;
		System.out.println("StatelessSessionBean.incremente=("+n+")=>"+total);
		return total;
	}

}
