package fr.esisar.calculatrice.operations.ensemblistes;

import java.util.Arrays;
import java.util.Collections;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste {

  @Override
  public String getNom() {
    return "min";
  }

  @Override
  protected Double doCalculer(Double[] operandes) {
    return Collections.min(Arrays.asList(operandes));
  }

}
