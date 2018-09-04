package com.garage.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

  private TypeMoteur type;
  private String cylindre;
  private double prix;

  public Moteur(){
    this.type = null;
    this.cylindre = "Inconnu";
    this.prix = 0.0d;
  }

  public Moteur(String pCylindre, double pPrix){
    this.cylindre = pCylindre;
    this.prix = pPrix;
  }

  // ---- Setters ----

  public void setTypeMoteur(TypeMoteur pType) {
    this.type = pType;
  }

  public void setCylindre(String pCylindre){
    this.cylindre = pCylindre;
  }

  public void setPrix(double pPrix){
    this.prix = pPrix;
  }

  // ---- Getters ----

  public TypeMoteur getTypeMoteur() {
    return type;
  }

  public String getCylindre(){
    return cylindre;
  }

  public double getPrix(){
    return prix;
  }

  // ---- Méthode toString() ----

  public String toString(){
    return this.getTypeMoteur() + " " + this.getCylindre() + " (" + this.getPrix()  + "€) " ;
  }


}

