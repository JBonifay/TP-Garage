package com.garage.moteur;

public class MoteurElectrique extends Moteur{

  public MoteurElectrique(String pCylindre, double pPrix){
    super(pCylindre, pPrix);
    this.setTypeMoteur(TypeMoteur.ELECTRIQUE);
  }

}
