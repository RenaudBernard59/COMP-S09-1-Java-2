/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaiafarming;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Ferme {
    
    private double budget;
    private String nom;
    private String motDePasse;
    private ArrayList<Terrain> terrains = new ArrayList<>();
    private ArrayList<Ressource> ressourcesPossedees = new ArrayList<>();

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    public ArrayList<Terrain> getTerrains() {
        return terrains;
    }

    public void setTerrains(ArrayList<Terrain> terrains) {
        this.terrains = terrains;
    }

    public ArrayList<Ressource> getRessourcesPossedees() {
        return ressourcesPossedees;
    }

    public void setRessourcesPossedees(ArrayList<Ressource> ressourcesPossedees) {
        this.ressourcesPossedees = ressourcesPossedees;
    }

    
}
