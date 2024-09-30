package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.CalculatriceException;
import java.util.HashSet;
import java.util.Set;

public class Calculatrice {

  private Set<Operation> operations = new HashSet<>();

  public void ajouterOperation(Operation operation) {
    operations.add(operation);
  }

  public Operation chercherOperation(String nom) {
    for (Operation operation : operations) {
            if (operation.getNom().equals(nom)) {
                return operation;
            }
        }
        // Si l'opération n'est pas trouvée, retourne null
        return null;
  }

  public double calculer(String nom, double operande1, double operande2) throws CalculatriceException{
    Operation operation = chercherOperation(nom);
    if (operation == null) {
      throw new CalculatriceException("Opération " + nom + " non trouvée.");
    }
    return operation.calculer(operande1, operande2);
  }
}
