package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.Operation;
import java.util.HashMap;
import java.util.Map;

public class Calculatrice {

  private Map<String, Operation> operations = new HashMap<>();

  public void ajouterOperation(Operation operation) {
    operations.put(operation.getNom(), operation);
  }

  public Operation chercherOperation(String nom) {
    return operations.get(nom);
  }

  public double calculer(String nom, double operande1, double operande2) {
    Operation operation = chercherOperation(nom);
    if (operation == null) {
      throw new CalculatriceException("Opération " + nom + " non trouvée.");
    }
    return operation.calculer(operande1, operande2);
  }
}
