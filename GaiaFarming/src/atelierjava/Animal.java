/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;           
    
/**
 * Représente la superclasse des animaux.
 * @author Formation
 */
public class Animal {
    
    static int nbAnimaux = 0;
    
    int tailleEnCm;
    double poidsEnKg;
    String genre;
    String espece;

    @Override
    public String toString() {
        String res = this.espece + "," + 
                this.poidsEnKg + "," + 
                this.genre + "," + 
                this.tailleEnCm;
        
        return res;
    }

    
    
    public void afficher(){
        
        System.out.println(this.espece + "," + 
                this.poidsEnKg + "," + 
                this.genre + "," + 
                this.tailleEnCm);
    }
    
    public Animal instancier(){
        return new Animal();
    }
    
    public Animal() {
        nbAnimaux ++;
    }
    
    
}
