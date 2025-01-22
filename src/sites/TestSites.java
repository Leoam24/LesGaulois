package sites;
import personnages.Soldat;
import personnages.Gaulois;
import personnages.Grade;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingétorix = new Gaulois("Vercingétorix", 5);
		
		Village village = new Village(vercingétorix);
		vercingétorix.parler("Je suis un grand guerrier et je vais créer mon village");
		
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		Camp camp = new Camp(minus);
		
	}
	
}
