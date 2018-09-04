package com.garage.options;

public class SiegeChauffant implements Option {

  @Override
  public double prix() {
    return 1300.0d;
  }

  @Override
  public String toString() {
    return "Sieges chauffant (" + this.prix() + " €)";
  }
}
