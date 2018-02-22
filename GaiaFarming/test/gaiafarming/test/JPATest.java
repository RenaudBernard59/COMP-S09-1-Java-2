/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaiafarming.test;

import gaiafarming.entity.Joueur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author renob
 */
public class JPATest {
    @Test
    public void demarreJPA() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
        EntityManager em = factory.createEntityManager();
        
       em.getTransaction().begin();
       
       Joueur j = new Joueur();
       j.setPseudo("thomas");
       j.setMotDePasse("1234");
       em.persist(j);
       
       em.getTransaction().commit();
       
       
       
       
    }
    
}
