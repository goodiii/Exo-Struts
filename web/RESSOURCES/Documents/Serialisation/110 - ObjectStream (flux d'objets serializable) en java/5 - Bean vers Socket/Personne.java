public class Personne implements java.io.Serializable {
	private String nom = "";
	private String prenom = "";
	private int numero = 0;
  
	public Personne(String nom, String prenom, int numero) {
		this.nom = nom;
		this.numero = numero;
		this.prenom = prenom;
	}
	public String 	getNom() 		{ return nom; }
	public void 	setNom(String nom) 	{ this.nom = nom; }
	public int 	getNumero() 		{ return numero; }
	public void 	setNumero(int numero) 	{ this.numero = numero; }
	public String 	getPrenom() 		{ return prenom; }
	public void 	setPrenom(String prenom) { this.prenom = prenom;}
}
