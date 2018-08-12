package Moteurs;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre) {
		super(cylindre);
		this.type = TypeMoteur.DIESEL;
	}

}
