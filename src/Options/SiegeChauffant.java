package Options;

public class SiegeChauffant implements Option {

	// redefinition of method : getPrix
	@Override
	public Double getPrix() {
		return 562.9d;
	}

	public String toString() {
		return "(Siège chauffant " + getPrix() + "€)";
		
	}
	
}
