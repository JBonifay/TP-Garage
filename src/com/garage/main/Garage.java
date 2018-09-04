package com.garage.main;

import com.garage.vehicule.Vehicule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Garage {

  private List<Vehicule> voitures = new ArrayList<>();
  private File f = new File("garage.txt");
  private ObjectOutputStream oos;
  private ObjectInputStream ois;


  public Garage(){

    if(!f.exists()) {
      System.out.println("\033[31mAucune voiture enregistrée !\033[0m");
    }
    System.out.println("***************************\n" + "*  Garage OpenClassrooms  *\n" + "***************************");
  }


  // ---- Lire dans le fichier grace a l'Arraylist lecture ----

  public String toString(){


    ArrayList<Vehicule> nouveauGarage;
    String str = "\n";

    try {

      ois = new ObjectInputStream(
              new BufferedInputStream(
                      new FileInputStream(
                              new File("garage.txt"))));

      nouveauGarage = (ArrayList<Vehicule>) ois.readObject();

      for(int i = 0;i<nouveauGarage.size();i++)
        str += nouveauGarage.get(i) + "\n";


    } catch (IOException e) {
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }



    return str;
  }


  // ---- Ecrire dans le fichier grace a l'Arraylist voitures ----

  public void addVoiture(Vehicule voit){

    // ---- Ajout des voitures dans l'arraylist ----

    this.voitures.add(voit);


    // ---- Output ----

    try {

      oos = new ObjectOutputStream(
              new BufferedOutputStream(
                      new FileOutputStream(
                              new File("garage.txt"))));

      oos.reset();
      oos.writeObject(voitures);
      oos.close();


    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}

