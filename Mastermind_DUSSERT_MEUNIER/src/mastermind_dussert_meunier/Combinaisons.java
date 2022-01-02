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
    
    String [] couleur ;
    int posi;
    int coul;
    
    public Combinaisons (String [] couleurs){
        couleur = new String [couleurs.length];
        for (int i=0; i<couleurs.length;i++){
            couleur[i]=couleurs[i];
        }
    }  
}

