/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_dussert_meunier;

/**
 *
 * @author dusse
 */
public class Partie {
    int essai;
    
    public void CommencerPartie(){
        //initialiserCombi();
        //while(combiGagnante()==false && essai<=12){
            //choisir combi
            //similitudesPosi
            //similitudesCoul
            //afficher console
            essai++;
       // }
        if(essai<=12){
            System.out.println("Vous avez gagné au bout de "+essai+" essais !");
        }
        else {
            System.out.println("Vous avez perdu");
        }
    }
}
