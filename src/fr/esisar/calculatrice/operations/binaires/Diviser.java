package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;
import fr.esisar.calculatrice.CalculatriceException;

public class Diviser extends OperationBinaire {

  @Override
  public String getNom() {
    return "/";
  }

  @Override
  protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
    if (operande2 == 0) {
      throw new CalculatriceException("Division par zéro");
    }
    return operande1 / operande2;
  }

}
