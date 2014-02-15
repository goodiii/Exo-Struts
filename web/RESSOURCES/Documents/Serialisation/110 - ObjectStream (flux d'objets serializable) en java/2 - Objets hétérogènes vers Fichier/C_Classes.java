abstract class Animal implements java.io.Serializable {
	abstract public void chanter();
}

class Mammif�re extends Animal {
	public void chanter() { System.out.println("meuh"); }
}

class Chien extends Mammif�re {
	public void chanter() { System.out.println("oua oua"); }
}

class Chat extends Mammif�re {
	public void chanter() { System.out.println("miaou"); }
}

class Oiseau extends Animal {
	public void chanter() { System.out.println("cuicui"); }
}

class Canard extends Oiseau {
	public void chanter() { System.out.println("coincoin"); }
}

class Corbeau extends Oiseau {
	public void chanter() { System.out.println("croa"); }
}