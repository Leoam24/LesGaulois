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
		System.out.println(donnerAuteur() + ": «" + texte + "».");
		}
	
	protected abstract String donnerAuteur();


	public void frapper(Personnage adversaire) {
		System.out.println(donnerAuteur() + " envoie un grand coup dans la mâchoire de " + adversaire.getNom());
		adversaire.recevoirCoup(force/3);
		}
		
	public void recevoirCoup(int forceCoup) {
		if(forceCoup >= force) {
			this.force = 0;
			System.out.println("J'abandonne");
		}
		else {
			this.force = force - forceCoup;
			System.out.println("Aie !");
		}
	}



}
