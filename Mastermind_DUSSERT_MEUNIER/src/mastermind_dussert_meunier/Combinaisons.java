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
    
    public int SimilitudePosi(Combinaisons cc,Combinaisons c){
        posi=0;
        for (int i=0;i<4;i++){
            if (cc.couleur[i]==c.couleur[i]){
                posi++;
            }
        }
        return posi;
    }
    
    public int SimilitudeCoul(Combinaisons cc,Combinaisons c){
        coul=0;
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (cc.couleur[i]==c.couleur[j]){
                    coul++;
                }
            }
        }
        return coul;
    }
    
    public boolean combiGagnante(Combinaisons cc,Combinaisons c){
        if (SimilitudePosi(cc,c)==4 && SimilitudeCoul(cc,c)==4){
            return true;
        }
        return false;
    }
}

