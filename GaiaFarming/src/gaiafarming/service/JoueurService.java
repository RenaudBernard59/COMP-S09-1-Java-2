/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaiafarming.service;

import gaiafarming.dao.JoueurDAO;
import gaiafarming.dao.RessourceDAO;
import gaiafarming.entite.Joueur;
import gaiafarming.entite.Ressource;

/**
 *
 * @author Formation
 */
public class JoueurService {

    public void ajouterRessource(
            long joueurId,
            Ressource.TypeRessource typeRessource,
            long quantite) {

        // 1. Génère les ressources SI aucune ressource pour ce joueur
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(joueurId);

        // 1. Ajouter 5 carottes
        for (int i = 0; i < quantite; i++) {

            Ressource ressource = new Ressource();
            ressource.setDesignation(typeRessource);
            ressource.setJoueur(joueur);
            joueur.getRessourcesPossedees().add(ressource);

            RessourceDAO ressourceDAO = new RessourceDAO();
            ressourceDAO.ajouter(ressource);
        }
    }

    public void rejoindrePartie(long idJoueur) {

        // 1. Génère les ressources SI aucune ressource pour ce joueur
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(idJoueur);
        if (joueur.getRessourcesPossedees().isEmpty()) {

            // 1. Ajouter 5 carottes
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CAROTTE, 5);

            // 2. Ajouter 5 blés
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.BLE, 5);
            
            // 3. Ajoute 5 chèvres
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CHEVRE, 5);
            
            // 4. Ajoute 2 fermiers
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.FERMIER, 2);
        }
    }

    public Joueur connexion(String pseudo, String mdp) {

        JoueurDAO dao = new JoueurDAO();
        Joueur j = dao.rechercher(pseudo, mdp);

        return j;
    }

    /**
     * Pseudo: - mini 3 lettres, maxi 8 - unique Mdp: - mini 5 lettres, maxi 10
     * - au moins une Maj et un chiffre
     *
     * @param pseudo
     * @param mdp
     */
    public void inscription(String pseudo, String mdp) {

        // Validation
        // Erreur si pseudo < 3 ou > 8 car
        if (!pseudo.matches(".{3,8}")) {
            throw new RuntimeException("Le pseudo doit être compris entre 3 et 8 caractères");
        }

        // Err si mdp < 5 ou > 10 car
        if (!mdp.matches(".{5,10}")) {
            throw new RuntimeException("Le mdp doit être compris entre 5 et 10 caractères");
        }

        if (!mdp.matches(".*[A-Z].*")) {
            throw new RuntimeException("Le mdp requiert au moins une majuscule");
        }

        if (!mdp.matches(".*[0-9].*")) {
            throw new RuntimeException("Le mdp requiert au mois un chiffre");
        }

        // Vérifier que le pseudo est encore dispo
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
            throw new RuntimeException("Ce pseudo existe déjà");
        }

        // Ajoute le joueur en BD
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotDePasse(mdp);
        dao.ajouter(ferme);
    }
}
