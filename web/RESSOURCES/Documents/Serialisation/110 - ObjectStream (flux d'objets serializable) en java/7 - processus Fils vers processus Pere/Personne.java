public class Personne implements java.io.Serializable {
	public java.util.Date date = null;
	private String nom = "";
	private String prenom = "";
	private int taille = 0;
  
	public Personne(String nom, String prenom, int taille) {
		this.nom = nom;
		this.taille = taille;
		this.prenom = prenom;
		this.date = new java.util.Date();
	}
	public String 	getNom() 		{ return nom; }
	public void 	setNom(String nom) 	{ this.nom = nom; }
	public int 	getTaille() 		{ return taille; }
	public void 	setTaille(int taille) 	{ this.taille = taille; }
	public String 	getPrenom() 		{ return prenom; }
	public void 	setPrenom(String prenom) { this.prenom = prenom;}
}
