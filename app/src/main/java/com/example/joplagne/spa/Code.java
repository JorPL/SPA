package com.example.joplagne.spa;

import java.io.Serializable;

/**
 * Created by joplagne on 29/09/17.
 */

public class Code implements Serializable{

    private String nom;
    private String race;
    private String poids;
    private int genre;
    private int gentillesse;

    public Code(String nom, String race, String poids, int gentillesse, int genre) {
        this.nom = nom;
        this.race = race;
        this.poids = poids;
        this.gentillesse = gentillesse;
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getGentillesse() {
        return gentillesse;
    }

    public void setGentillesse(int gentillesse) {
        this.gentillesse = gentillesse;
    }

    /*public String getBackgroundGentillesse(int gentillesse){
        switch (gentillesse){
            case 0:
                return "lvl1";
            case 1:
                return "lvl2";
            case 2:
                return "lvl3";
            case 3:
                return "lvl4";
            default:
                return "blanc";
        }
    }*/
}
