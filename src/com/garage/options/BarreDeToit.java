package com.garage.options;

public class BarreDeToit implements Option {

  @Override
  public double prix() {
    return 200.0d;
  }

  @Override
  public String toString() {
    return "Barre de toit (" + this.prix() + " €)";
  }
}
