package com.garage.options;

public class Climatisation implements Option {

  @Override
  public double prix() {
    return 900.0d;
  }

  @Override
  public String toString() {
    return "Climatisation (" + this.prix() + " €)";
  }
}
