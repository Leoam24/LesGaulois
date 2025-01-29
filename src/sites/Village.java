package sites;
import personnages.Gaulois;

public class Village {
	private Gaulois chef;
    private int nbVillageoisMax = 5;
	private Gaulois[] villageois = new Gaulois[nbVillageoisMax];
    private int nbVillageois;
	
	
	public Village(Gaulois chef) {
		this.chef = chef;
		this.nbVillageois = 1;
	}
	
	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois, Gaulois chef) {
		if(nbVillageois < nbVillageoisMax) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			chef.parler("Bienvenue " + gaulois.getNom());
		}
		else {
			chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
		}
		
	}



}
