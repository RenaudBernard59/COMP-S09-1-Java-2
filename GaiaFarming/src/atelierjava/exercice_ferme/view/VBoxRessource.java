/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author renob
 */
public class VBoxRessource extends VBox
{
    private Label lNbreRessources = new Label();
    private ImageView iImage = new ImageView("C:\\Users\\renob\\Documents\\GitHub\\COMP\\COMP-S09-1-Java-2\\GaiaFarming\\src\\atelierjava\\exercice_ferme\\view\\VBoxRessoure.java");

    public VBoxRessource(long nbRessource, String urlImage) {
        this.getChildren().add(this.iImage);
         this.getChildren().add(this.lNbreRessources);
        
    }
}
