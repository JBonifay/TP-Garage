package com.garage.options;

public class VitreElectrique implements Option {

  @Override
  public double prix() {
    return 640.0d;
  }

  @Override
  public String toString() {
    return "Vitre electriques (" + this.prix() + " €)";
  }
}