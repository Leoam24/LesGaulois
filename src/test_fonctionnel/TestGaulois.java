package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {

	public static void mainA(String[] args) { // main A
		Gaulois asterix = new Gaulois("Asterix", 8);
		//System.out.println(asterix);
		
		System.out.println(asterix.getNom());
	
	}
	
	public static void main(String[] args) { // main B
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		
		asterix.parler("ceci est un teste");
	}
	
	
}

