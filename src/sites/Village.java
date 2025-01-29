package sites;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;

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
	
	public void afficherVillage() {
		System.out.println("\nLe village dirigé par " + chef.getNom() + " est habité par :\n");
		
		for(int i=1; i<nbVillageois ;i++) {
			System.out.println(villageois[i].getNom());
			
		}
		
	}
	public void changerChef(Gaulois newChef) {
		chef.parler("Je laisse mon grand bouclier au grand " + newChef.getNom());
		chef = newChef;
		newChef.parler("Merci !");
	}
	
}



