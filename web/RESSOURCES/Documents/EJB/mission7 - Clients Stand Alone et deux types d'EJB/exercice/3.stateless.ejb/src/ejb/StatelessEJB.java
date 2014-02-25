package ejb;

import javax.ejb.Stateless;

@Stateless
public class StatelessEJB implements StatelessInterface {
	int compteur = 0;
	public int incremente() { return ++compteur; }
}
