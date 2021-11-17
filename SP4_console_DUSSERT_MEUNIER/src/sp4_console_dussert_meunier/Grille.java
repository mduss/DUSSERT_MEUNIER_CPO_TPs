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
        return true;
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
        
        //gagnant sur une même ligne
        for (int i=0;i<6;i++){
            for (int j=0;j<3;j++){
               if ((lireCouleurDuJeton(i,j)==lireCouleurDuJeton(i,j+1)) && ((lireCouleurDuJeton(i,j+1)==lireCouleurDuJeton(i,j+2)) && (lireCouleurDuJeton(i,j+2)==lireCouleurDuJeton(i,j+3)) )){
                   return true;
               } 
            }
        }
        
        // gagnant sur une même colonne
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
               if ( (lireCouleurDuJeton(i,j)==lireCouleurDuJeton(i+1,j)) && ((lireCouleurDuJeton(i+1,j)==lireCouleurDuJeton(i+2,j)) && (lireCouleurDuJeton(i+2,j)==lireCouleurDuJeton(i+3,j)) )){
                   return true;
               } 
            }
        }
        
        //gagnant en diagonale positive
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
               if ( (lireCouleurDuJeton(i,j)==lireCouleurDuJeton(i+1,j)) && ((lireCouleurDuJeton(i+1,j)==lireCouleurDuJeton(i+2,j)) && (lireCouleurDuJeton(i+2,j)==lireCouleurDuJeton(i+3,j))) ){
                   return true;
               } 
            }
        }
        
        //gagnant en diagonale négative
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
               if ( (lireCouleurDuJeton(i,j)==lireCouleurDuJeton(i+1,j)) && ((lireCouleurDuJeton(i+1,j)==lireCouleurDuJeton(i+2,j)) && (lireCouleurDuJeton(i+2,j)==lireCouleurDuJeton(i+3,j))) ){
                   return true;
               } 
            }
        }
        return false;
    }
    
    public void tasserGrille(int c){
        for (int i=0;i<6;i++){
            if (cellulesJeu[i][c].jetonCourant==null){
                for (int j=i;j<5;j++){
                    cellulesJeu[j][c].jetonCourant=cellulesJeu[j+1][c].jetonCourant;
                    cellulesJeu[j][c].désintégrateur=cellulesJeu[j+1][c].désintégrateur;
                    cellulesJeu[j][c].trouNoir=cellulesJeu[j+1][c].trouNoir;
                }
                cellulesJeu[6][c].jetonCourant=null;
                cellulesJeu[6][c].désintégrateur=false;
                cellulesJeu[6][c].trouNoir=false;                
            }
        }
    }
    
    public 
}
