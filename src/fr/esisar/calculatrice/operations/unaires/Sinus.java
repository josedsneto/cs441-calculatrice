package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.OperationUnaire;

public class Sinus extends OperationUnaire {

  @Override
  public String getNom() {
    return "sin";
  }

  @Override
  protected Double doCalculer(Double operande) {
    return Math.sin(operande);
  }

}
