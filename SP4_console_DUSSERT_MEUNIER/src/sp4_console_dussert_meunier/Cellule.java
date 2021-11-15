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
        jetonCourant=null;
        trouNoir=false;
        désintégrateur=false;
    }
    
    public boolean affecterJeton(Jeton jetonCourant){
        if (jetonCourant==null){
            jetonCourant=true;
            return true;
        }
        else {
            return false;
        }
    }
    public void recupererJeton(){
        return ;
    }
    supprimerJeton

}
