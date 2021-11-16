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
        ListeJoueurs[1].Couleur="rouge";
        ListeJoueurs[2].Couleur="jaune";
    }
    
    public void initialiserPartie(){
        grilleJeu.afficherGrilleSurConsole();
        ListeJoueurs[1].ListeJetons=new Jeton[21];
        ListeJoueurs[2].ListeJetons=new Jeton[21];
    }
    
    public void debuterPartie(){
        
    }
}
