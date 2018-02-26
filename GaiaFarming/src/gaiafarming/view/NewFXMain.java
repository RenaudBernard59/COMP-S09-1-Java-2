/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaiafarming.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author renob
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        
        HBox barreOutils = new HBox();
        barreOutils.getChildren().add(new Button("Inscription"));
        barreOutils.getChildren().add(new Button("Connexion"));        
        
        root.setTop(barreOutils);
        
    
  
        
        root.setBottom(new Label("Copyright M2i - 2018"));
        
        Scene scene = new Scene(root, 300, 250);
        
        
      // scene.setTitle("Gaia Farming");
        
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
