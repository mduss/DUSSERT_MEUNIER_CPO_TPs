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
    Random rand= new Random();
    String [] couleur;
    Combinaisons combinaison;
    Combinaisons combiCourante;
    String[] Choix ={"ro","bl","ja","ve","vi"};
    int posi;
    int coul;
    
    public void initialiserCombi(){
        combinaison = new Combinaisons(); 
        couleur = new String[4];
        int numco;
        for (int i=0;i<4;i++){
            numco=rand.nextInt(6);
            combinaison.couleur[i]=Choix[numco];
        }
    }
    
    public int SimilitudePosi(){
        for (int i=0;i<4;i++){
            if (combiCourante.couleur[i]==combinaison.couleur[i]){
                posi++;
            }
        }
        return posi;
    }
    
    public int SimilitudeCoul(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (combiCourante.couleur[i]==combinaison.couleur[j]){
                    coul++;
                }
            }
        }
        return coul;
    }
    
    public boolean combiGagnante(){
        if (SimilitudePosi()==4 && SimilitudeCoul()==4){
            return true;
        }
        return false;
    }
}

