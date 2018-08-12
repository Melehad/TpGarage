package Vehicules;

import java.util.ArrayList;
import Moteurs.Moteur;
import Options.Option;

public class Vehicule {


	protected Double prix;
	protected String nom;
	protected Moteur moteur;
	protected ArrayList<Option> options = new ArrayList<Option>();
	protected Marque nomMarque;
	protected Double totalPriceOptions = 0.0d;

	public Vehicule() {
	}

	public Double getPrix() {
		return prix;
	}

	public ArrayList<Option> getOptions() {
		return options;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public Moteur getMoteur() {
		return moteur;
	}
	
	public String toString() {
		
		StringBuilder str1 = new StringBuilder();
			// concatenation of values
			str1.append("+ Voiture ").append(nomMarque).append(" : ");
			str1.append(nom).append(" ").append(moteur.toString());
			str1.append(" (").append(prix).append("€) [");
		
			// loop for options list
	        for (int j = 0; j < options.size(); j++) {
		        Option option = options.get(j);
				str1.append(option.toString());	
		        if (options.size() != 0) {
		        	if (j != options.size() - 1) {
		        		str1.append(", ");
		        	}
		        }	
			} 
	        str1.append("] d'une valeur totale de ");
	        
	        calculToString();
	        str1.append(prix + totalPriceOptions);
	        str1.append(" €");

        return str1.toString();	
	}
	
	
	public void calculToString() {
		// sum of car price and options
        for (int j = 0; j < options.size(); j++) {	
        	Option option = options.get(j);
        	totalPriceOptions = totalPriceOptions + option.getPrix();	
		}
	}

	
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void addOption(Option option) {
		this.options.add(option);
	}

}
