package com.garage.moteur;

public class MoteurDiesel extends Moteur{

  public MoteurDiesel(String pCylindre, double pPrix){
    super(pCylindre, pPrix);
    this.setTypeMoteur(TypeMoteur.DIESEL);
  }

}
