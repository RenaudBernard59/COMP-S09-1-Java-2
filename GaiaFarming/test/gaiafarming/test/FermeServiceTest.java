/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaiafarming.test;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renob
 */
public class FermeServiceTest {
    @Test
    public void FermeServiceTest() {
        String pseudo = "Robert";
        String mdp = "aBcP123";
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
        String pattern = "[A-Z]+[a-z]+[0-9]+";
        
        if (5 <= mdp.length() && mdp.length() <= 10) {
            //MP Valide
                if (mdp.matches(".*[A-Z]+.*") && mdp.matches(".*[a-z]+.*") && mdp.matches(".*[0-9]+.*")) {
                    //MP Valide
                    System.out.println("Mot de Passe Valide");
                }
                else {          
                    //MP Invalide
                    System.out.println("Mot de Passe Invalide Pas les bons caractères");
                }
                //Testeur de mot de passe perso
                if (mdp.matches(".*[A-Z]+.*")) {System.out.println("Le MP contient bien des MAJUSCULES");}
                if (mdp.matches(".*[a-z]+.*")) {System.out.println("Le MP contient bien des MINUSCULES");}
                if (mdp.matches(".*[0-9]+.*")) {System.out.println("Le MP contient bien des CHIFFRES");}
                
                if (mdp.matches(".*[A-Z]+.*[a-z]+.*[0-9]+")) {
                    //MP Valide
                    System.out.println("Mot de Passe MegaPaternValide");
                }
        } else {
            //MP Invalide
            System.out.println("Mot de Passe Invalide Trop Long ou Trop Court");
        }
        
       

    }
    
}
