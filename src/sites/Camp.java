package sites;
import personnages.Soldat;
import personnages.Romain;

public class Camp {
	private Soldat commandant;
	private int nbPersonneMax = 80;
	private Soldat[] soldats = new Soldat[nbPersonneMax];
	private int nbSoldats;
	
	public Camp(Soldat minus) {
		this.commandant = minus;
		this.nbSoldats++;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if((soldat != null) && ( nbSoldats < nbPersonneMax ) ) {
			soldats[nbSoldats] = soldat;
			nbPersonneMax++;
		}
		
	}
	
}
