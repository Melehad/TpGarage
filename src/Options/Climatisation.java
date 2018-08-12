package Options;

public class Climatisation implements Option {
	
	// redefinition of method : getPrix
	@Override
	public Double getPrix() {
		return 347.3d;
	}
	
	public String toString() {
		return "(Climatisation " + getPrix() + "€)";
		
	}
	
}
