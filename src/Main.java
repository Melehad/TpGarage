

import Moteurs.MoteurDiesel;
import Moteurs.MoteurElectrique;
import Moteurs.MoteurEssence;
import Moteurs.MoteurHybride;
import Options.BarreDeToit;
import Options.Climatisation;
import Options.GPS;
import Options.SiegeChauffant;
import Options.VitreElectrique;
import Vehicules.A300B;
import Vehicules.D4;
import Vehicules.Lagouna;
import Vehicules.Vehicule;

public class Main {

	public static void main(String[] args) {

		Garage garage = new Garage();   
		
		//garage.readFile();
		System.out.println(garage);

	   	Vehicule lagouna1 = new Lagouna();
		Vehicule peugeot1 = new A300B();
		Vehicule citroen1 = new D4();
		Vehicule lagouna2 = new Lagouna();
		Vehicule peugeot2 = new A300B();
		Vehicule citroen2 = new D4();

		lagouna1.setMoteur(new MoteurEssence("150 Chevaux"));
		peugeot1.setMoteur(new MoteurElectrique("1500 W"));
		citroen1.setMoteur(new MoteurDiesel("200 Hdi"));
		lagouna2.setMoteur(new MoteurDiesel("500 Hdi"));
		peugeot2.setMoteur(new MoteurHybride("ESSENCE/Electrique"));
		citroen2.setMoteur(new MoteurElectrique("100 KW"));
		
		lagouna1.addOption(new GPS());
	   	lagouna1.addOption(new SiegeChauffant());
	   	lagouna1.addOption(new VitreElectrique());
	   	peugeot1.addOption(new Climatisation());
	   	peugeot1.addOption(new BarreDeToit());
	   	peugeot1.addOption(new SiegeChauffant());
	   	citroen1.addOption(new BarreDeToit());
	   	citroen1.addOption(new Climatisation());
	   	citroen1.addOption(new GPS());
	   	peugeot2.addOption(new VitreElectrique());
	   	peugeot2.addOption(new BarreDeToit());
	   	citroen2.addOption(new SiegeChauffant());
	   	citroen2.addOption(new BarreDeToit());
	   	citroen2.addOption(new Climatisation());
	   	citroen2.addOption(new GPS());
	   	citroen2.addOption(new VitreElectrique());
	   	
	   	garage.addVoiture(lagouna1);
	   	garage.addVoiture(peugeot1);
	   	garage.addVoiture(citroen1);
	   	garage.addVoiture(lagouna2);
	   	garage.addVoiture(peugeot2);
	   	garage.addVoiture(citroen2);
	   	
	}

}
