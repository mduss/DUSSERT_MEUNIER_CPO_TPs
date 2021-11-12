/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_dussert_meunier;

/**
 *
 * @author dusse
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean désintégrateur;
    
    public Cellule(){
        Cellule[][] cellules=new Cellule[6][7];
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                cellules[i][j]=int(String(i)+String(j));
            }
        }
    }
    public boolean affecterJeton(Jeton){
        
    }
    public recupererJeton(){
        return ;
    }
    supprimerJeton

}
