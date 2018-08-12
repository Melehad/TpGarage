package Options;

public class VitreElectrique implements Option {

	// redefinition of method : getPrix
	@Override
	public Double getPrix() {	
		return 212.35d;
	}
	
	public String toString() {
		return "(Vitre électrique " + getPrix() + "€)";
		
	}

}
