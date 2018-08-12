package Vehicules;

public class Lagouna extends Vehicule {

	//call the constructor of the parent class with the keyword super
	public Lagouna() {
		super();
		this.nomMarque = Marque.RENO;
		this.nom = "Lagouna";
		this.prix = 23123d;
	}

}
