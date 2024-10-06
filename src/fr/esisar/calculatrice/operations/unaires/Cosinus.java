package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Cosinus extends OperationUnaire {

  @Override
  public String getNom() {
    return "cos";
  }

  @Override
  protected Double doCalculer(Double operande) {
    return Math.cos(operande);
  }

}
