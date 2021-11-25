/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_dussert_meunier;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author dusse
 */
public class Partie {
    Joueur [] ListeJoueurs=new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie(Joueur J1,Joueur J2){
      ListeJoueurs[0]=J1;
      ListeJoueurs[1]=J2;
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
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();
        joueurCourant=ListeJoueurs[0];
        System.out.println(grilleJeu.etreGagnantePourJoueur(joueurCourant));
        System.out.println(grilleJeu.etreRemplie());
        for (int i=0;i<5;i++){
            int l = rand.nextInt(6);
            int c = rand.nextInt(5);
            grilleJeu.placerTrouNoir(l, c);
        }
        while(grilleJeu.etreGagnantePourJoueur(joueurCourant)==false && grilleJeu.etreRemplie()==false){
            System.out.println(grilleJeu.etreGagnantePourJoueur(joueurCourant));
            System.out.println(grilleJeu.etreRemplie());
            grilleJeu.afficherGrilleSurConsole();
            if (joueurCourant==ListeJoueurs[0]){
                joueurCourant=ListeJoueurs[1];
            }
            else{
                joueurCourant=ListeJoueurs[0];
            }
            int numco;
            System.out.println(joueurCourant.Nom+" choisissez un numéro de colonne : ");
            numco=sc.nextInt();
            while((numco>8||numco<0)||grilleJeu.colonneremplie(numco-1)){
                System.out.println(joueurCourant.Nom+" choisissez un numéro de colonne : ");
                numco=sc.nextInt();
            }
            numco-=1;
            Jeton j=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
            grilleJeu.ajouterJetonDansColonne(j,numco);
        }
        System.out.print(joueurCourant.Nom+" a gagné !");
    }
}
