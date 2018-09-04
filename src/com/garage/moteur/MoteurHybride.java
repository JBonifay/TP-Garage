package com.garage.moteur;

public class MoteurHybride extends Moteur{

  public MoteurHybride(String pCylindre, double pPrix){
    super(pCylindre, pPrix);
    this.setTypeMoteur(TypeMoteur.HYBRIDE);
  }

}
