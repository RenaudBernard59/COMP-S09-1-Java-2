# COMP-S09-1-Java-2

## Modéliser un jeu multi en ligne

### Liste des ressources
* Une certaine quantité de carottes ;
* Une certaine quantité de Chèvres ;
* Une certaine quantité de Blé ; 
* Une certaine quantité de Fromage.

### Lors d'une nouvelle partie
* Chaque joueur commence avec :
    * 3 Blés ;
    * 3 Carottes ;
    * 2 Fermiers.

### Cycles de productions
Tous les 6 mois :
* **1 Carotte** plantée donne **2 ou 3 Carottes** ;
* **1 Blé planté** plantée donne **3 ou 4 Blés** ;
* **1 Chèvre donne** donne **2 ou 3 Fromages**.

### Nourrir
Chaque trimestre
* **Chaque Fermier** de la Ferme doit **se nourrir** soit de :
    * 3 Blés ;
    * 2 Carottes ;
    * 2 Fromages ;
    * 1 Chèvre.
* **Chaque Chèvre** doit **se nourrir** : 
    * 1 Blé.
* Un Individu non nourris **Meurt**.

### Reproduction
* **Tous les ans**, chaque **couple de Chèvre** donne 1 **chevreau**.
* **Tous les 18 mois**, chaque **couple de Fermier** donne 1 ou 2 **Fermiers**.

### Exchange Market
* 1 chèvre vaut 4 Blés ou 2 Carottes ou 5 Fromages (et vice-versa).

### Fin Partie
* Si tout les fermiers meurent : Fin de Partie.


-------------------------------------------------------------------
Interface utilisateur avec bouton rafraichir, indique toutes les ressources.
Un classement des meilleurs joueurs est dispo.
Le temps doit s'écoule bcp + vite que prévu (genre une année dure quelques minutes).
Gérer avec quelle ressource nourir qui.
