package ejb;

import javax.ejb.Remote;

@Remote
public interface StatefulInterface {
	public int incremente();
}