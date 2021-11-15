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
    
    public boolean affecterJeton(Jeton j){
        if (jetonCourant==null){
            jetonCourant=j;
            return true;
        }
        else {
            return false;
        }
    }
    public Jeton recupererJeton(){
        return jetonCourant;
    }
    public boolean supprimerJeton(){
        if (jetonCourant==null){
            return false;
        }
        else {
            jetonCourant=null;
            return true; 
        }
    }

}
