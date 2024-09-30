package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.Operation;

public class Diviser implements Operation {
  
  @Override
  public String getNom() {
    return "Diviser";
  }

  @Override
  public Double calculer(Double operande1, Double operande2) throws CalculatriceException {
    if (operande2 == 0) {
      throw new CalculatriceException("Division par zéro");
    }
    return operande1 / operande2;
  }

}
