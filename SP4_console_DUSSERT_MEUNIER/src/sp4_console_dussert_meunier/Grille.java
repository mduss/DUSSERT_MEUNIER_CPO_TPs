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
public class Grille {
    Cellule cellulesJeu[][]=new Cellule[6][7];
    public Grille(){
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                cellulesJeu[i][j]= new Cellule();
            }
        }
    }
    public boolean ajouterJetonDansColonne(Jeton j,int c) {
        for (int l=0;l<6;l++){
            if (cellulesJeu[l][c].jetonCourant==null){
               cellulesJeu[l][c].jetonCourant= j;
               return true;
            }
            else {
               return false;
            }
        }  
        return true;
    }
    
    public boolean etreRemplie(){
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if (cellulesJeu[i][j].jetonCourant==null){
                    return false;
                }
            }
        } 
        return false;
    }
    public void viderGrille() {
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                cellulesJeu[i][j].jetonCourant=null;
                cellulesJeu[i][j].désintégrateur=false;
                cellulesJeu[i][j].trouNoir=false;                
            }
        } 
    }
    public void afficherGrilleSurConsole() {
        for (int i=0;i<6;i++){
            System.out.println();
            for (int j=0;j<7;j++){
                if (cellulesJeu[i][j].lireCouleurDuJeton()=="rouge") {
                    System.out.print("\u001B[31m 0");
                }
                if (cellulesJeu[i][j].lireCouleurDuJeton()=="jaune") {
                   System.out.print("\u001B[33m 0");
                }
                else {
                    System.out.print("-");
                }
            }
        }
    }
    
    public boolean celluleOccupee(int l,int c) {
        if (cellulesJeu[l][c].jetonCourant!=null){
            return true;
        }
        else {
            return false;
        }
    }
    
    public String lireCouleurDuJeton(int l,int c) {
        return cellulesJeu[l][c].lireCouleurDuJeton();
    }
    
    public boolean etreGagnantePourJoueur(Joueur J) {
        
    }
}
