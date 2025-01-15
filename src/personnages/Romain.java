package personnages;

public class Romain extends Personnage{
	
	
	public Romain(String nom, int force) {
		super(nom, force);
		}
	
	@Override 
	protected String donnerAuteur() {
		return "Le Romain ";
		
	}
	
	
	
	
	
	
}	
	
	
	
	
/*	
	
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;	
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le romain " + nom + ": «" + texte + "».");
		}
	
	public void recevoirCoup(int degats) {
		if(degats >= force) {
			this.force = 0;
			System.out.println("J'abandonne");
		}
		else {
			this.force = force - degats;
			System.out.println("Aie !");
		}
	}

}
*/