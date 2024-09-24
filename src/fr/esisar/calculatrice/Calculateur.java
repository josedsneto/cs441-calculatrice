package fr.esisar.calculatrice;

import fr.esisar.calculatrice.Calculatrice;
import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.Ajouter;
import fr.esisar.calculatrice.operations.Soustraire;
import fr.esisar.calculatrice.operations.Multiplier;
import fr.esisar.calculatrice.operations.Diviser;

public class Calculateur {
    public Calculateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        calculatrice.ajouterOperation(new Ajouter());
        calculatrice.ajouterOperation(new Soustraire());
        calculatrice.ajouterOperation(new Multiplier());
        calculatrice.ajouterOperation(new Diviser());

        try {
            System.out.println("10 / 0 = " + calculatrice.calculer("Diviser", 10, 0)); // Exception
        } catch (CalculatriceException e) {
            System.out.println(e.toString());
        }
    }
}

