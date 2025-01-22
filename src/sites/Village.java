package sites;
import personnages.Gaulois;

public class Village {
	public Gaulois chef;
	
	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}
}
