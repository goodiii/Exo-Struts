package ear.ejb.stateful;

import javax.ejb.Stateful;
import ear.pojo.Pojo2;

@Stateful
public class StatefulSessionBean implements StatefulInterfaceLocal, StatefulInterfaceRemote {

	int total = 0;

	static {
		System.out.println("class StatefulSessionBean loadee");
	}

	public StatefulSessionBean() {
		super();
		System.out.println("un StatefulSessionBean cree");
	}

	protected void finalize() throws Throwable {
		System.out.println("un StatefulSessionBean disparait");
		super.finalize();
	}
	public int fac(int n) { return Pojo2.fac(n); }
	public int fibo(int n) { return Pojo2.fibo(n); }
	public int incremente(int n) {
		total += n;
		System.out.println("StatefulSessionBean.incremente("+n+")=>"+total); 
		return total;
	}

}
