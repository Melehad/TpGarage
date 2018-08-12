package Options;

public class GPS implements Option {
	
	// redefinition of method : getPrix
	@Override
	public Double getPrix() {
		return 113.5d;
	}

	public String toString() {
		return "(GPS " + getPrix() + "€)";
		
	}


	
	
	
}
