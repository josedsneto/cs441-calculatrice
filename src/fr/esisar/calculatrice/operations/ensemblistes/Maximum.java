package fr.esisar.calculatrice.operations.ensemblistes;

import java.util.Arrays;
import java.util.Collections;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste {

  @Override
  public String getNom() {
    return "max";
  }

  @Override
  protected Double doCalculer(Double[] operandes) {
    return Collections.max(Arrays.asList(operandes));
  }

}
