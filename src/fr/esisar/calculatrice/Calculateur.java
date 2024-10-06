package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.binaires.Ajouter;
import fr.esisar.calculatrice.operations.binaires.Diviser;
import fr.esisar.calculatrice.operations.binaires.Multiplier;
import fr.esisar.calculatrice.operations.binaires.Soustraire;
import fr.esisar.calculatrice.operations.ensemblistes.Maximum;
import fr.esisar.calculatrice.operations.ensemblistes.Minimum;
import fr.esisar.calculatrice.operations.unaires.Cosinus;
import fr.esisar.calculatrice.operations.unaires.Sinus;
import fr.esisar.calculatrice.operations.unaires.Tangente;
import fr.esisar.calculatrice.operations.unaires.ValeurAbsolue;
import fr.esisar.calculatrice.operations.Operation;

public class Calculateur {
  public Calculateur() {
  }

  public static void main(String[] args) throws CalculatriceException {

    Set<Operation> operations = new HashSet<>();

    Calculatrice calc = new Calculatrice(operations);

    calc.ajouterOperation(new Ajouter());
    calc.ajouterOperation(new Diviser());
    calc.ajouterOperation(new Multiplier());
    calc.ajouterOperation(new Soustraire());
    calc.ajouterOperation(new Maximum());
    calc.ajouterOperation(new Minimum());
    calc.ajouterOperation(new Cosinus());
    calc.ajouterOperation(new Sinus());
    calc.ajouterOperation(new Tangente());
    calc.ajouterOperation(new ValeurAbsolue());

    Double[] operandes = new Double[] { 6.4, 6.7 };

    try {
      System.out.println(calc.calculer("sin", operandes));
    } catch (CalculatriceException e) {
      System.out.println(e.toString());
    }
  }
}
