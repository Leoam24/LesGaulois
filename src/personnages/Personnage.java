package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;	
		}
	
	public String getNom() {
		return this.nom;
		}

	public void parler(String texte) {
		System.out.println("Le" + donnerAuteur() + nom + ": «" + texte + "».");
		}
	
	protected abstract String donnerAuteur();


	public void frapper(Personnage adversaire) {
		//System.out.println(donnerAuteur() + " envoie un grand coup dans la mâchoire de " + adversaire.getNom());
		System.out.println("Le"+ donnerAuteur() + getNom() + " donne un grand coup au" + adversaire.donnerAuteur() + adversaire.getNom()+".");
		
		
		adversaire.recevoirCoup(force/3);
		}
		
	public void recevoirCoup(int forceCoup) {
		if(forceCoup >= force) {
			this.force = 0;
			parler("J'abandonne...");
		}
		else {
			this.force = force - forceCoup;
			parler("Aie !");
		}
	}



}
