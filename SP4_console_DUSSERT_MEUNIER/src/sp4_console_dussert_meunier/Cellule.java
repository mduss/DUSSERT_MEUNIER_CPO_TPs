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
            if (présenceTrouNoir()){
                System.out.println("Votre Jeton a été englouti par un trou noir...");
            }
            else if (présenceDésintégrateur()){
                recupererDesintegrateur ();
                System.out.println("Vous avez récupéré un désintégrateur !");
            }
            else {
                jetonCourant=j;
            }
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
    
    public boolean placerTrouNoir(){
        if (trouNoir==false){
            trouNoir=true;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean placerDésintégrateur(){
        if (désintégrateur==false){
            désintégrateur=true;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean présenceTrouNoir(){
        if (trouNoir==true){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean présenceDésintégrateur(){
        if (désintégrateur==true){
            return true;
        }
        else{
            return false;
        }
    }
    public String lireCouleurDuJeton(){
        if (jetonCourant!=null){
            return jetonCourant.lireCouleur();
        }
        else{
            return "vide";
        }
    }
    
    public boolean recupererDesintegrateur () {
        if (présenceDésintégrateur()){
            désintégrateur=false;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean activerTrouNoir(){
        if (présenceTrouNoir()){
           //vérifier présence de  jetonCourant ?
           jetonCourant=null;
           return true;
        }
        else {
            return false;
        }
    }
    
}
