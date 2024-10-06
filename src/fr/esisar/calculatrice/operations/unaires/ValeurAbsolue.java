package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class ValeurAbsolue extends OperationUnaire {

  @Override
  public String getNom() {
    return "abs";
  }

  @Override
  protected Double doCalculer(Double operande) {
    return Math.abs(operande);
  }
}
