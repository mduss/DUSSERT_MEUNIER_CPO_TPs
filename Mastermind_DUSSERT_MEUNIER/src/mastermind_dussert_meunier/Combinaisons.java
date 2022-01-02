/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_dussert_meunier;

import java.util.Random;

/**
 *
 * @author dusse
 */
public class Combinaisons {
    
    String [] couleur ; //couleurs composants la combinaision
    
    public Combinaisons (String [] couleurs){ //en entréé un tableau de couleurs qui représentera les couleurs de la combinaison
        couleur = new String [couleurs.length];
        for (int i=0; i<couleurs.length;i++){
            couleur[i]=couleurs[i];
        }
    }  
}

