package Options;

public class BarreDeToit implements Option {

	// redefinition of method : getPrix
	@Override
	public Double getPrix() {
		return 29.9d;
	}
	
	public String toString() {
		return "(Barre de toit " + getPrix() + "€)";
		
	}
	
}
