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
public class Affichage {
    String Combinaison[][]=new String[12][4];
    String simPo[][]=new String[12][4];
    String simCo[][]=new String[12][4];
    
    public void tableaux(int tent, int posi, int coul,Combinaisons combiCourante){
        for (int i=0; i<4;i++){
            if (combiCourante.couleur[i]=="ro"){
                Combinaison[tent][i]="\u001B[31m 0 ";
            }
            else if(combiCourante.couleur[i]=="bl"){
                Combinaison[tent][i]="\u001B[34m 0 ";
            }
            else if(combiCourante.couleur[i]=="ja"){
                Combinaison[tent][i]="\u001B[33m 0 ";
            }
            else if(combiCourante.couleur[i]=="ve"){
                Combinaison[tent][i]="\u001B[32m 0 ";
            }
            else if(combiCourante.couleur[i]=="vi"){
                Combinaison[tent][i]="\u001B[35m 0 ";
            }
            else if (combiCourante.couleur[i]=="wh"){
                Combinaison[tent][i]="\u001B[37m 0 ";
            }
        }
        for (int i=posi;i>=0;i--){
            simPo[tent][i]="\u001B[31m * ";
        }
        for (int i=0;i<coul;i++){
            simPo[tent][i]="\u001B[37m * ";
        }
    }
    
    
    public void affichageJeu(){
        for (int i=0; i<12;i++){
            System.out.println();
            for (int j=0;j<4;j++){
                System.out.print(simPo[i][j]);
            }
            System.out.print(" | ");
            for (int j=0;j<4;j++){
                System.out.print(Combinaison[i][j]);
            }
            System.out.print(" | ");
            for (int j=0;j<4;j++){
                System.out.print(simCo[i][j]);
            }
        }
    }
}
