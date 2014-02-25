package ejb;

import javax.ejb.Remote;

@Remote
public interface StatelessInterface {
	public int incremente();
}