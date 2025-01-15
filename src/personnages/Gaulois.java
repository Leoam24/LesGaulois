package personnages;

public class Gaulois extends Personnage {
	
	public Gaulois(String nom, int force) {
		super(nom, force);
		}
	
	@Override 
	protected String donnerAuteur() {
		return "Le Gaulois ";
		
	}
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	/*
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;	
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le gaulois " + nom + ": «" + texte + "».");
		}

	
	public static void mainB(String[] args) { // main B
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		
	}

	public void frapper(Romain romain) {
		
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}


}
*/