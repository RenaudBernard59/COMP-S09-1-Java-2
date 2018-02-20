/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaiafarming.service;

/**
 *
 * @author renob
 */
public class FermeService {

    /**
     * 
     * @param pseudo :
     *  - mini 3, lettres maxi 8 ;
     *  - unique ;
     * @param mdp :
     *  - mini 5 lettres, maxi 10 ;
     *  - au moins une Maj et un chiffre ;
     */
    
    public void inscription(String pseudo, String mdp) {
        //Test Pseudo
        if (3 <= pseudo.length() && pseudo.length() <= 8) {
            //Pseudo Valide
            System.out.println("Pseudo Valide");
        } else {
            //Pseudo Invalide
            System.out.println("Pseudo Invalide");
        }
        
        //Test MP
        //MP Pattern
        String pattern = ".*[A-Z]+.*[a-z]+.*[0-9]+";
                        if (5 <= mdp.length() && mdp.length() <= 10) {
            //MP Valide
                if (mdp.matches(pattern)) {
                    //MP Valide
                    System.out.println("Mot de Passe Valide");
                }
                else {
                    //MP Invalide
                    System.out.println("Mot de Passe Invalide");
                }
                
        } else {
            //MP Invalide
            System.out.println("Mot de Passe Invalide");
        }
        
                            
        //Vérifier Pseudo Unique
        
        
    }
}
