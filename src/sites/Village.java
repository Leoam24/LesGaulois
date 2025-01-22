package sites;
import personnages.Gaulois;

public class Village {
	private Gaulois chef;
    private int nbVillageoisMax = 50;
	private Gaulois[] villageois = new Gaulois[nbVillageoisMax];
    private int nbVillageois;
	
	
	public Village(Gaulois chef) {
		this.chef = chef;
		this.nbVillageois++;
	}
	
	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if((gaulois != null) && ( nbVillageois < nbVillageoisMax ) ) {
			nbVillageoisMax++;
			villageois[nbVillageoisMax] = gaulois;
			
		}
		
	}



}
