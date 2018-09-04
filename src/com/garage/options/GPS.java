package com.garage.options;

public class GPS implements Option {

  @Override
  public double prix() {
    return 130.0d;
  }

  @Override
  public String toString() {
    return "GPS (" + this.prix() + " €)";
  }
}
