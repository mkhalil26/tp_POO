package com.example.demo.models;

import java.util.Date;

public class Enfant extends Patient {
    private String classdetude; //enum plutard
    private String numTelmere;
    private String numTelpere;

    public Enfant(String nom, String prenom, String adress, Date dateDeNaissance, String lieuDeNaissance, String classdetude, String numTelmere, String numTelpere) {
        super(nom, prenom, dateDeNaissance, lieuDeNaissance, adress);
        this.classdetude = classdetude;
        this.numTelmere = numTelmere;
        this.numTelpere = numTelpere;
    }

    //getters
    public String getClassdetude() {
        return classdetude;
    }

    public String getNumTelmere() {
        return numTelmere;
    }

    public String getNumTelpere() {
        return numTelpere;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAdress() {
        return this.adress;
    }

    public String getLieuNaissance() {
        return this.lieuNaissance;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }
}
