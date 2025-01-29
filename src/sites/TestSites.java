package sites;
import personnages.Soldat;
import personnages.Gaulois;
import personnages.Grade;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingétorix = new Gaulois("Vercingétorix", 5);
		
		Village village = new Village(vercingétorix);
		
		
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		Camp camp = new Camp(minus);
		
		
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		camp.ajouterSoldat(brutus, minus);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		camp.ajouterSoldat(milexcus, minus);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		camp.ajouterSoldat(tulliusOctopus, minus);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		camp.ajouterSoldat(ballondebaudrus, minus);
		
		
		
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		village.ajouterVillageois(agecanonix,vercingétorix);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		village.ajouterVillageois(assurancetourix,vercingétorix);
		Gaulois astérix = new Gaulois("Astérix",5);
		village.ajouterVillageois(astérix,vercingétorix);
		Gaulois obelix = new Gaulois("Obelix",15);
		village.ajouterVillageois(obelix,vercingétorix);
		Gaulois prolix = new Gaulois("Prolix",2);
		village.ajouterVillageois(prolix,vercingétorix);
	
		
		camp.afficherCamp();
		
		village.afficherVillage();
	
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		village.changerChef(abraracourcix);
		
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		camp.changerCommandant(briseradius);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		camp.changerCommandant(chorus);
	}
}
