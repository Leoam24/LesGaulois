package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Personnage;
import personnages.Druide;

public class TestGaulois {
/*
	public static void mainA(String[] args) { // main A
		Gaulois asterix = new Gaulois("Asterix", 8);
		//System.out.println(asterix);
		
		System.out.println(asterix.getNom());
	
	}
	
*/
	public static void mainB(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		asterix.parler("Bonjour à tous");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU… UN GAUGAU…");
		
		/*
		 
		 for(int i=0;i<2;i++) {
			minus.recevoirCoup(3);
		}
	*/
		// debut combat
		
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix" , 3);
		
		
		
	}




}

