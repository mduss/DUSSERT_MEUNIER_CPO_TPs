/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_dussert_meunier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dusse
 */
public class Affichage {
    String Combinaison[][]=new String[12][4]; //tableau avec les combinsiaons tentés
    String simPo[][]=new String[12][4];// tableau avec les similitudes de position
    String simCo[][]=new String[12][4];//tableau avec les siilitudes de couleur
    String[] Choix ={"ro","bl","ja","ve","vi","wh"}; //tableau de toutes les couleurs possibles
    int posi; //nombre de couleurs ayont la bonne position
    int coul; //nombre de couleurs exactes
    
    public void tableaux(int tent, int posi, int coul,Combinaisons combiCourante){
        for (int i=0; i<4;i++){//le tableau de la combinaison courante rentre dans la ligne du numéro de tentative du tableaux avec toutes les combinsaisons tentés
            Combinaison[tent][i]=combiCourante.couleur[i];
        }
        if (posi>0){ // pour chaque position correct une étoile rouge ets ajouté au tableau du nombre positions correctes (sur la ligne de la tentatiive actuelle)
            for (int i=3;i>3-posi;i--){
                simPo[tent][i]=" * ";
            }
        }
        if (coul>0){ //pour chaque couleur correct une étoile est ajouté au tableau du nombre des couleurs correctes (sur la ligne de la tentatiive actuelle)
            for (int i=0;i<coul;i++){
                simCo[tent][i]=" * ";
            }
        }
    }
    
    
    public void affichageJeu(){// affichege de la grill de jeu
        System.out.println("  Position   | Combinaison  |   Couleur   ");
        for (int i=0; i<12;i++){
            for (int j=0;j<4;j++){
                if (" * ".equals(simPo[i][j])){
                    System.out.print("\u001B[31m * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.print("\u001B[30m | ");
            for (int j=0;j<4;j++){
                if ("ro".equals(Combinaison[i][j])){
                System.out.print("\u001B[31m 0 ");
                }
                else if("bl".equals(Combinaison[i][j])){
                    System.out.print("\u001B[34m 0 ");
                }
                else if("ja".equals(Combinaison[i][j])){
                    System.out.print("\u001B[33m 0 ");
                }
                else if("ve".equals(Combinaison[i][j])){
                    System.out.print("\u001B[32m 0 ");
                }
                else if("vi".equals(Combinaison[i][j])){
                    System.out.print("\u001B[35m 0 ");
                }
                else if ("wh".equals(Combinaison[i][j])){
                    System.out.print("\u001B[37m 0 ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\u001B[30m | ");
            for (int j=0;j<4;j++){
                if (" * ".equals(simCo[i][j])){
                    System.out.print("\u001B[30m * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    public String [] initialiserCombiAléat(){ //initialise une combianison aléatoire que le joueur doit retrouver
        Random rand= new Random();
        String [] couleur = new String[4]; //crée un tableau de 4 cases format texte
        int numco; //initialise le numéro de la case qui va être tiré au hasard
        for (int i=0;i<4;i++){
            numco=rand.nextInt(6); //le numéro tiré au sort est en entier compris entre 0 et 5 compris
            couleur[i]=Choix[numco];// la couleur correspondant au numéro de la case du tableaux de couleur Choix attéri dans le tableau de couleur
            System.out.print(couleur[i]+ " ;"); //pour vérifier que le jeu marche 
        }
        //System.out.println();
        return couleur;// le tableau de couleurs tirées au hasard et retourné
    }
    
    public String[] Combi(){ //demande au joueur de choisir une combinaison 
        Scanner sc=new Scanner(System.in);
        String [] couleur = new String[4];
        for (int i=0;i<4;i++){
            System.out.println("Couleur "+i+" : \nSaisissez : \nro pour rouge \nbl pour bleu \nja pour jaune \nve pour vert \nvi pour violet \nwh pour blanc");
            sc.reset();
            sc=new Scanner(System.in);
            couleur[i]=sc.nextLine(); // le joueur va écrire une couleur d'après le modèle qui va s'fficher sur la console
            // et tant que la couleur rentrer ne correspond pas à ro bl ja ve vi ou wh alors il va redemander à l'utilisateur de saisir une couleur
            while (!"bl".equals(couleur[i])&&!"ro".equals(couleur[i])&&!"ja".equals(couleur[i])&&!"ve".equals(couleur[i])&&!"vi".equals(couleur[i])&&!"wh".equals(couleur[i])){
                System.out.println("Saisissez une couelur valide : ");
                sc.reset();
                sc=new Scanner(System.in);
                couleur[i]=sc.nextLine();
            }
        }
        return couleur;// le tableau de couelur est retourner
    }
    public int SimilitudePosi(Combinaisons cc,Combinaisons c){// donne le nombre de coleur à la bonne position
        posi=0; // initialisation de la variable à 0
        for (int i=0;i<4;i++){// test pour toute les positions de 0 à 4 si les couleurs correspondent
            if (cc.couleur[i].equals(c.couleur[i])){// incrémente de 1 si c'est le cas 
                posi+=1;
            }
        }
        return posi; // retourne le nombre de positions exactes
    }
    
    public int SimilitudeCoul(Combinaisons cc,Combinaisons c){//donne le nombre de couleur en commun avec la combinaison à trouver
        coul=0;
        //initialisation d'un tableau qui permet de connaitre s'il y a deux fois la même couleur dans la combinaison à trouver
        int [] c2 = new int[4];
        int [] c1 = new int[4];//on fait le même chose pour les combinaisons courantes pour éviter les doublons
        for (int l=0;l<4;l++){// on test pour chaque tableaux combinaison et combinasion courante s'il y des mêmes couleurs
            for (int v=l+1;v<4;v++){ //en comparant une case avec toutes las cases qui la suivent
                if (c.couleur[l].equals(c.couleur[v])){ //si c'est les memes on met un 1 dans une des cases qui a une couleur en double
                    c2[l]=1;
                }
                if (cc.couleur[l].equals(cc.couleur[v])){// pareil pour la combinaison courante
                    c1[l]=1;
                }
            }
        }
        for (int i=0;i<4;i++){ //on fait une double boucle  pour tester toutes les possobilités d'égalités entre les couleurs
            if(c1[i]==1){// si la case de combinaison correspond à une couleur en double (marqué par un 1), alors on passe à la case de combinasion suivante
                continue;
            }
            for (int j=0;j<4;j++){
                if (c2[j]==1){ //pareil s'il y a deux fois la même couleur dans combinaison courante alors l'algo va passer à la prochaine proposition de couleur
                    continue;
                }
                if (cc.couleur[i].equals(c.couleur[j])){ // si légalité est respecté alors il y a une couleur en commun entre la combinasion à deviner et celle écrite par le joueur
                    coul+=1;
                }
            }
        }
        return coul; //on retourne le nombre de couleurs en commun avec la combinaison à deviner
    }
    
    public boolean combiGagnante(Combinaisons cc,Combinaisons c){ //dit si la combinaison du joueur est la meme que celle à trouver
        if (SimilitudePosi(cc,c)==4){
            return true;
        }
        return false;
    }
}
