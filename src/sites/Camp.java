package sites;
import personnages.Soldat;
import personnages.Romain;

public class Camp {
	private Soldat commandant;
	
	public Camp(Soldat minus) {
		this.commandant = minus;
		
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	
}
