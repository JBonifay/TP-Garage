package com.garage.moteur;

public class MoteurEssence extends Moteur{

  public MoteurEssence(String pCylindre, double pPrix){
    super(pCylindre, pPrix);
    this.setTypeMoteur(TypeMoteur.ESSENCE);
  }

}
