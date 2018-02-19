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
        String pattern = "[a-z]{1,}[A-Z]{1,}[0-9]{1,}";
        
        if (5 <= mdp.length() && mdp.length() <= 10) {
            //MP Valide
                if (mdp.matches(pattern) == true) {
                    //MP Valide
                    System.out.println("Mot de Passe Valide");
                }
                else {
                    //MP Invalide
                    System.out.println("Mot de Passe Invalide Pas les bons caractères");
                }
                
        } else {
            //MP Invalide
            System.out.println("Mot de Passe Invalide Trop Long ou Trop Court");
        }
        
       

    }
    
}
