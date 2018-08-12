package Moteurs;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre) {
		super(cylindre);
		this.type = TypeMoteur.ESSENCE;
	}

}
