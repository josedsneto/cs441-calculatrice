package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationUnaire implements Operation {

  @Override
  public Double calculer(Double[] operandes) throws CalculatriceException {
    if (operandes.length != 1) {
      throw new CalculatriceException("Nombre d'opérandes != 1 pour une opération binaire");
    } else {
      return this.doCalculer(operandes[0]);
    }
  }

  protected abstract Double doCalculer(Double operande);

}
