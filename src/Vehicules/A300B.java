package Vehicules;

public class A300B extends Vehicule {

	//call the constructor of the parent class with the keyword super
	public A300B() {
		super();
		this.nomMarque = Marque.PIGEOT;
		this.nom = "A300B";
		this.prix = 28457d;
	}
	

}
