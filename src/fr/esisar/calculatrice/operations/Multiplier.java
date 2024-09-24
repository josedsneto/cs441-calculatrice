package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.operations.Operation;

public class Multiplier implements Operation{

  @Override
  public String getNom() {
    return "Multiplier";
  }

  @Override
  public Double calculer(Double operande1, Double operande2) {
    return operande1 * operande2;
  }

  
}
