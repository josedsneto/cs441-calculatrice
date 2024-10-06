package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Tangente extends OperationUnaire {

  @Override
  public String getNom() {
    return "tan";
  }

  @Override
  protected Double doCalculer(Double operande) {
    return Math.tan(operande);
  }
}
