package personnages;
import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	private int forcePotion;
	private Random random;
	private int nbDoses;
	
	public Druide(String nom, int force) {
		super(nom, force);
		
		try {
			random = SecureRandom.getInstanceStrong();
			} catch (Exception e) {
			e.printStackTrace();
			}
	}
	@Override 
	protected String donnerAuteur() {
		return " Druide ";
		
	}
	
	public void fairePotionMagique(int nombreDeDoses) {
		forcePotion = random.nextInt(5) + 2;
		nbDoses = nombreDeDoses;
		System.out.println("Il y à " + nombreDeDoses + "potions magique de force " + forcePotion);
		
	}
}
