package ejb;

import javax.ejb.Stateful;

@Stateful
public class StatefulEJB implements StatefulInterface {
	int compteur = 0;
	public int incremente() { return ++compteur; }
}
