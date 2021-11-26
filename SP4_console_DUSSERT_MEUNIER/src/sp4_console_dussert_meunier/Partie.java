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
        
        int l;
        int c;
//place trou noirs en début de partie
        int tabligneTrouNoirs[]=new int[5];
        int tabcolonneTrouNoirs[]=new int[5];
        for (int i=0;i<5;i++){
            l = rand.nextInt(6);
            c = rand.nextInt(5);
            while (grilleJeu.cellulesJeu[l][c].présenceTrouNoir()){
                l = rand.nextInt(6);
                c = rand.nextInt(5);
            }
            l=tabligneTrouNoirs[i];
            c=tabcolonneTrouNoirs[i];
            grilleJeu.placerTrouNoir(l,c);
        }
//place désintégrateurs
        for (int i=0;i<3;i++){
            l = rand.nextInt(6);
            c = rand.nextInt(5);
            while (grilleJeu.cellulesJeu[l][c].présenceTrouNoir()||grilleJeu.cellulesJeu[l][c].désintégrateur){
                l = rand.nextInt(6);
                c = rand.nextInt(5);
            }
            grilleJeu.placerDésintégrateur(l, c);
        }
        for (int i=0;i<2;i++){
            int p= rand.nextInt(4);
            l=tabligneTrouNoirs[p];
            c=tabcolonneTrouNoirs[p];
            grilleJeu.placerDésintégrateur(l, c);
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
            String choix;
            System.out.println(joueurCourant.Nom+" Tapez : p pour placer un jeton"
                    + "d pour placer un désintégrateur"
                    + "r pour récupérer un de vos jetons");
            choix=sc.nextLine();
            if (choix=="d"){
                if (joueurCourant.nombreDésintégrateur>0){
                    System.out.println("Placez votre désintégrateur"
                            + "Ligne : ");
                    int numligne=sc.nextInt();
                    System.out.println("Colonne : ");
                    int numco=sc.nextInt();
                    if (grilleJeu.celluleOccupee(numligne, numco)){
                        if (grilleJeu.placerDésintégrateur(numligne, numco)){
                            joueurCourant.utiliserDesintegrateur();
                            System.out.println(joueurCourant.Nom +" il vous reste "+joueurCourant.nombreDésintégrateur);
                        }
                    }
                    else{
                        System.out.println(joueurCourant.Nom +" vous n'avez pas de désintégrateurs"
                                + "veuillez saisir p ou r");
                        choix=sc.nextLine();
                    }
                }
            }
            else if (choix=="p"){
                int numco;
                numco=sc.nextInt();
                System.out.println("choisissez un numéro de colonne");
                while((numco>8||numco<0)||grilleJeu.colonneremplie(numco-1)){
                    System.out.println(joueurCourant.Nom+" choisissez un numéro de colonne : ");
                    numco=sc.nextInt();
                }
                numco-=1;
                Jeton j=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
            
                grilleJeu.ajouterJetonDansColonne(j,numco);
            }
            else {
                System.out.println("Quel jeton voulez-vous récupérer ?"
                            + "Ligne : ");
                    int numligne=sc.nextInt();
                    System.out.println("Colonne : ");
                    int numco=sc.nextInt();
                
                Jeton jeton=grilleJeu.recupererJeton(numligne, numco);
                joueurCourant.ajouterJeton(jeton);
            }
        }
        System.out.print(joueurCourant.Nom+" a gagné !");
    }
}
