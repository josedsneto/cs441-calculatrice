package fr.esisar.calculatrice.operations;

public interface Operation {

  public String getNom();

  public Double calculer(Double operande1, Double operande2);
}
