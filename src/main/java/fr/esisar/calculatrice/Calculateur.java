package fr.esisar.calculatrice;

import fr.esisar.calculatrice.Calculatrice;

public class Calculateur {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int a = 10;
    int b = 3;
    Calculatrice cal = new Calculatrice(a, b);

    System.out.println(cal.ajouter());
    System.out.println(cal.soustraire());
    System.out.println(cal.multiplier());
    System.out.println(cal.diviser());
  }
}
