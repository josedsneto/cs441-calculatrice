package fr.esisar.calculatrice.operations;

public class Ajouter implements Operation {

  @Override
  public String getNom() {
    return "Ajouter";
  }

  @Override
  public Double calculer(Double operande1, Double operande2) {
    return operande1 + operande2;
  }

}
