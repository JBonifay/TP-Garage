package com.garage.vehicule;

import com.garage.moteur.Moteur;
import com.garage.options.Option;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {

  // ---- Déclaration variable et objets ----

  private double prix;
  private String nom;
  private List<Option> options = new ArrayList<Option>();
  private Marque nomMarque;
  private Moteur moteur;

  // ---- Constructeur défaut ----

  public Vehicule(){
    this.prix = 0.00d;
    this.nom = "Inconnu";
    this.options = new ArrayList<>(options);
    this.nomMarque = null;
    this.moteur = null;
  }

  // ---- Constructeur avec paramètres ----


  public Vehicule(double pPrix, String pNom, List<Option> pOptions, Marque pNomMarque, Moteur pMoteur){
    this.prix = pPrix;
    this.nom = pNom;
    this.options = new ArrayList<>(options);
    this.nomMarque = pNomMarque;
    this.moteur = pMoteur;
  }

  // ---- Getter ----

  public double getPrix(){
    return prix;
  }

  public String getNom(){
    return nom;
  }

  public List<Option> getOptions() {
    return options;
  }

  public Marque getNomMarque(){
    return nomMarque;
  }

  public Moteur getMoteur(){
    return moteur;
  }

  public double getPrixTotal(){

    double prixTotal = 0.00;

    for(int i = 0; i < this.getOptions().size();i++){
      prixTotal += this.getOptions().get(i).prix();
    }
    this.setPrix(this.moteur.getPrix() + prixTotal);
    return getPrix();
  }

  // ---- Setter ----

  public void setPrix(double pPrix){
    this.prix = pPrix;
  }

  public void setNom(String pNom){
    this.nom = pNom;
  }

  public void setOptions(List<Option> pOptions){
    this.options = pOptions;
  }

  public void setNomMarque(Marque pNomMarque) {
    this.nomMarque = pNomMarque;
  }

  public void setMoteur(Moteur pMoteur){this.moteur = pMoteur;}

  // ---- Méthode pour l'ajout d'options -----

  public void addOption(Option opt){
    this.options.add(opt);
  }

  // ---- Méthode toString() ----

  public String toString(){
    return  "Voiture " + this.getNomMarque() + " : " + this.getNom()
            + " Moteur " + this.getMoteur().toString()
            + this.getOptions()
            + " Prix total de : " + (this.getPrixTotal()) + " €";

  }



}
