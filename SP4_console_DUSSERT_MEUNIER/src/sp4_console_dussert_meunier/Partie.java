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
            tabligneTrouNoirs[i]=l;
            tabcolonneTrouNoirs[i]=c;
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
        boolean cg=false;
        while(grilleJeu.etreGagnantePourJoueur(joueurCourant)==false && grilleJeu.etreRemplie()==false){
            System.out.println(grilleJeu.etreGagnantePourJoueur(joueurCourant));
            System.out.println(grilleJeu.etreRemplie());
            grilleJeu.afficherGrilleSurConsole();
            if (cg){
                if (joueurCourant==ListeJoueurs[0]){
                joueurCourant=ListeJoueurs[1];
                }
                else{
                    joueurCourant=ListeJoueurs[0];
                }
            }
            String choix;
            System.out.println(joueurCourant.Nom+" tapez : \np pour placer un jeton \nd pour placer un désintégrateur \nr pour récupérer un de vos jetons");
            sc.reset();
            sc=new Scanner(System.in);
            choix=sc.nextLine();
            while (!"r".equals(choix)&&!"p".equals(choix)&&!"d".equals(choix)){
                System.out.println("tapez p ou r ou d");
                sc=new Scanner(System.in);
                choix=sc.nextLine();
            }
            if ("d".equals(choix)){
                if (joueurCourant.nombreDésintégrateur>0){
                    System.out.println("Placez votre désintégrateur \nColonne : ");
                    int numco=sc.nextInt();
                    System.out.println("Ligne : ");
                    int numligne =sc.nextInt();
                    if (grilleJeu.celluleOccupee(numligne-1, numco-1)){
                        if (grilleJeu.celluleOccupee(numligne-1, numco-1)){
                            grilleJeu.supprimerJeton(numligne-1, numco-1);
                            grilleJeu.tasserGrille(numco-1);
                            joueurCourant.utiliserDesintegrateur();
                            cg=true;
                            System.out.println(joueurCourant.Nom +" il vous reste "+joueurCourant.nombreDésintégrateur);
                        }
                    }
                }
                else{
                        cg=false;
                        System.out.println(joueurCourant.Nom +" vous n'avez pas de désintégrateurs");
                    }
                }
            else if ("p".equals(choix)){
                int numco;
                System.out.println("choisissez un numéro de colonne");
                numco=sc.nextInt();
                while((numco>8||numco<0)||grilleJeu.colonneremplie(numco-1)){
                    System.out.println(joueurCourant.Nom+" choisissez un numéro de colonne : ");
                    numco=sc.nextInt();
                }
                numco-=1;
                Jeton j=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
                int i=0;
                while (grilleJeu.cellulesJeu[i][numco].jetonCourant!=null){
                    i++;
                }
                if (grilleJeu.cellulesJeu[i][numco].présenceDésintégrateur()){
                    joueurCourant.nombreDésintégrateur+=1;
                }
                if (grilleJeu.ajouterJetonDansColonne(j,numco)){
                    joueurCourant.nombreJetonsRestants-=1;
                    cg=true;
                }
            }
            else {
                System.out.println("Quel jeton voulez-vous récupérer ? \nLigne : ");
                    int numligne=sc.nextInt();
                    System.out.println("Colonne : ");
                    int numco=sc.nextInt();
                
                Jeton jeton=grilleJeu.recupererJeton(numligne-1, numco-1);
                grilleJeu.tasserGrille(numco-1);
                joueurCourant.ajouterJeton(jeton);
            }
        }
        if (grilleJeu.etreRemplie()){
            System.out.print("Match nul !");
        }
        grilleJeu.afficherGrilleSurConsole();
        System.out.print(joueurCourant.Nom+" a gagné !");
    }
}
