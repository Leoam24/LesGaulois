package sites;
import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private int nbPersonneMax = 80;
	private Soldat[] soldats = new Soldat[nbPersonneMax];
	private int nbSoldats;
	
	public Camp(Soldat minus) {
		this.commandant = minus;
		this.nbSoldats = 1;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat, Soldat commandant) {
		if( nbSoldats < nbPersonneMax) {
			soldats[nbSoldats] = soldat;
			nbSoldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par\n"
					+ "Minus");
		}
		else {
			commandant.parler("Désolé " + soldat.getNom()+ "notre camp est complet ! ");
		}
		
	}
	
	public void afficherCamp() {
		System.out.println("\nLe camp dirigé par " + commandant.getNom() + " est habité par :\n");
		
		for(int i=1; i<nbSoldats ;i++) {
			System.out.println(soldats[i].getNom());
			
		}
		
	}
	
	public void changerCommandant(Soldat newCommandant) {
		
		if(newCommandant.getGrade().equals(Grade.CENTURION)) {
			commandant = newCommandant;
			newCommandant.parler("Moi Chorus je prends la direction du camp romain.");
		}
		else {
			newCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain");
		}
	
	}
	
}
