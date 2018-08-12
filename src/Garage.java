

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Options.Option;
import Vehicules.Vehicule;

public class Garage {

		protected ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
		protected ArrayList<Option> options = new ArrayList<Option>();
		
		public Garage() {
			readFile();
		}
		
		
		public String toString() {
			
			StringBuilder str = new StringBuilder();
	        str.append(System.lineSeparator());

	        for (Vehicule tuture : vehicules) {
	            str.append(tuture.toString()).append(System.lineSeparator());
	            
	        }
      
	        return str.toString();
	
		}
		
		
		
		public void readFile() {
			
////////////////READING ////////////////
		File file = new File("listeGarage.txt");
		BufferedReader bufferedReader = null;
		String messageEmptyGarage = "Aucune voiture sauvegardée !\n";
		

		try {
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			
			
			if ((line = bufferedReader.readLine()) != null) {
				System.out.println("***************************");
			   	System.out.println("*  Garage OpenClassrooms  *");
			   	System.out.println("***************************");
			   	
			   	do {
			   		System.out.println(line);
			   	} while ((line = bufferedReader.readLine()) != null);
			   	
			} else {
				System.err.println(messageEmptyGarage);
				System.out.println("***************************");
			   	System.out.println("*  Garage OpenClassrooms  *");
			   	System.out.println("***************************");
			}

		
		} catch (FileNotFoundException e) {
			System.err.printf("Le fichier %s n'a pas été trouvé.", file.toString());
		} catch (IOException e) {
			System.err.println("Impossible de lire le contenu du fichier " + file.toString());
		} finally {
			// execute finally quoiqu'il arrive
			
			try {
				
				if(bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				System.err.println("Impossible de fermer le fichier " + file.toString());
			} catch (NullPointerException e) {
				System.err.println("Impossible d'ouvrir le fichier " + file.toString());
			}

		}

		}
		

		public void addVoiture(Vehicule vehicule) {
			this.vehicules.add(vehicule);
			File file = new File("listeGarage.txt");
	
			
			
			
//////////////// WRITTING ////////////////

			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
				
				for (Vehicule tuture : vehicules) {
		            bufferedWriter.write(tuture.toString());
		            bufferedWriter.newLine();
		        }
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
		}




}
