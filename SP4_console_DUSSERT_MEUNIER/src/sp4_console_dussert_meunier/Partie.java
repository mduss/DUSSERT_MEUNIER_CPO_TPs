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
public class Partie {
    Joueur [] ListeJoueurs=new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie(Joueur J1,Joueur J2){
        
    }
    
    public void attribuerCouleurAuxJoueurs(){
        ListeJoueurs[0].Couleur="rouge";
        ListeJoueurs[1].Couleur="jaune";
    }
    
    public void initialiserPartie(){
        grilleJeu =new Grille();
        
        ListeJoueurs[0].ListeJetons=new Jeton[21]; 
        for (int i=0; i<21; i++){
            ListeJoueurs[0].ajouterJeton(new Jeton("rouge"));
        }
        ListeJoueurs[1].ListeJetons=new Jeton[21];
        for (int i=0; i<21; i++){
            ListeJoueurs[1].ajouterJeton(new Jeton("jaune"));
        }
    }
    
    public void debuterPartie(){
        grilleJeu.afficherGrilleSurConsole();
        
    }
}
