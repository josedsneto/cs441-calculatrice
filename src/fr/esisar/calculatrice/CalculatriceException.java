package fr.esisar.calculatrice;

import java.lang.Exception;

public class CalculatriceException extends Exception {
  private final String message;

  public CalculatriceException(String message) {
    super(message);
    this.message = message;
  }

  @Override
  public String toString() {
    return "CalculatriceException [message=" + message + ", toString()=" + super.toString() + "]";
  }


}
