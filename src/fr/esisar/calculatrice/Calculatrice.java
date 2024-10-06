package fr.esisar.calculatrice;

import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {

  private Set<Operation> operations;

  public Calculatrice(Set<Operation> operations) {
    this.operations = operations;
  }

  public Operation chercherOperation(String nom) {
    for (Operation operation : this.operations) {
      if (operation.getNom().equals(nom)) {
        return operation;
      }
    }
    return null;
  }

  public double calculer(String nom, Double[] operandes) throws CalculatriceException {
    Operation operation = chercherOperation(nom);
    if (operation == null) {
      throw new CalculatriceException("Opération " + nom + " inexistante dans la calculatrice.");
    }
    return operation.calculer(operandes);
  }

  public void ajouterOperation(Operation operation) {
    this.operations.add(operation);
  }

  public void retirerOperation(Operation operation) {
    this.operations.remove(operation);
  }
}
