/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.layout.GridPane;

/**
 *
 * @author renob
 */
public class EcranJeuView extends GridPane{
    private VBoxRessource vbrCarotte = new VBoxRessource(0, "file:C:\\Users\\renob\\Documents\\GitHub\\COMP\\COMP-S09-1-Java-2\\GaiaFarming\\src\\images\\carrot.png");
    private VBoxRessource vbrFermier = new VBoxRessource(0, "file:C:\\Users\\renob\\Documents\\GitHub\\COMP\\COMP-S09-1-Java-2\\GaiaFarming\\src\\images\\farmer.png");
    private VBoxRessource vbrBle = new VBoxRessource(0, "file:C:\\Users\\renob\\Documents\\GitHub\\COMP\\COMP-S09-1-Java-2\\GaiaFarming\\src\\images\\wheat.png");
    private VBoxRessource vbrChevre = new VBoxRessource(0, "file:C:\\Users\\renob\\Documents\\GitHub\\COMP\\COMP-S09-1-Java-2\\GaiaFarming\\src\\images\\goat.png");
    private VBoxRessource vbrFromage = new VBoxRessource(0, "file:C:\\Users\\renob\\Documents\\GitHub\\COMP\\COMP-S09-1-Java-2\\GaiaFarming\\src\\images\\cheese.png");

    public EcranJeuView() {
        this.add(vbrCarotte, 0, 0);
        this.add(vbrBle, 1, 0);
        this.add(vbrFermier, 0, 1);
        this.add(vbrFromage, 1, 1);
        this.add(vbrChevre, 0, 2);
}



}