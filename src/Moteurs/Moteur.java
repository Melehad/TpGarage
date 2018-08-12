package Moteurs;

abstract public class Moteur {

	protected TypeMoteur type;
	protected String cylindre;

	public Moteur(String cylindre) {
		this.cylindre = cylindre;
	}
	
	public String toString() {
		return "Moteur "  + type + " " + this.cylindre;
	}

}
