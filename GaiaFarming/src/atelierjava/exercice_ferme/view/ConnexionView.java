/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author renob
 */
public class ConnexionView extends GridPane {
    
    
    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot-de-passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bConnexion = new Button("Connexion");

    public ConnexionView(BorderPane borderPaneDuParent) {

        // Place des comosants dans ma vue
        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bConnexion, 1, 2);

        // Définir mon controleur sur clic bouton
        bConnexion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    // Récup pseudo et mdp entrés par l'utilisateur
                    String pseudoEntre = tfPseudo.getText();
                    String mdpEntre = pfMdp.getText();
                    
                    // Appelle service d'inscription
                    JoueurService service = new JoueurService();
                    service.connexion(pseudoEntre, mdpEntre);
                    
                    // Remplace centre du parent par texte vide
                    borderPaneDuParent.setCenter(new EcranJeuView());
                    
                } catch (Exception erreur) {
                    
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erreur");
                    alert.setHeaderText("Echec de connexion");
                    alert.setContentText(erreur.getMessage());
                    
                    erreur.printStackTrace();
                    
                    alert.showAndWait();
                }
            }
        });
    
    
    
    
    }
    
    
    
}
