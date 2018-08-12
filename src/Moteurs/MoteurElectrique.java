package Moteurs;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre) {
		super(cylindre);
		this.type = TypeMoteur.ELECTRIQUE;
	
	}

}
