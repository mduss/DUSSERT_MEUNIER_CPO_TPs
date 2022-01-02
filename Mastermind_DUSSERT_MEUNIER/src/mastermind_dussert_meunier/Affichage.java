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
    String Combinaison[][]=new String[12][4];
    String simPo[][]=new String[12][4];
    String simCo[][]=new String[12][4];
    Combinaisons combinaison;
    Combinaisons combiCourante;
    String[] Choix ={"ro","bl","ja","ve","vi","wh"};
    int posi;
    int coul;
    
    public void tableaux(int tent, int posi, int coul,Combinaisons combiCourante){
        for (int i=0; i<4;i++){
            Combinaison[tent][i]=combiCourante.couleur[i];
        }
        if (posi>0){    
            for (int i=3;i>3-posi;i--){
                simPo[tent][i]=" * ";
            }
        }
        if (coul>0){
            for (int i=0;i<coul;i++){
                simCo[tent][i]=" * ";
            }
        }
    }
    
    
    public void affichageJeu(){
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
        String [] couleur = new String[4];
        int numco;
        for (int i=0;i<4;i++){
            numco=rand.nextInt(6);
            couleur[i]=Choix[numco];
            System.out.print(couleur[i]+ " ;");
        }
        System.out.println();
        return couleur;
    }
    public String[] Combi(){
        Scanner sc=new Scanner(System.in);
        String [] couleur = new String[4];
        for (int i=0;i<4;i++){
            System.out.println("Couleur "+i+" : \nSaisissez : \nro pour rouge \nbl pour bleu \nja pour jaune \nve pour vert \nvi pour violet \nwh pour blanc");
            sc.reset();
            sc=new Scanner(System.in);
            couleur[i]=sc.nextLine();
            while (!"bl".equals(couleur[i])&&!"ro".equals(couleur[i])&&!"ja".equals(couleur[i])&&!"ve".equals(couleur[i])&&!"vi".equals(couleur[i])&&!"wh".equals(couleur[i])){
                System.out.println("Saisissez une couelur valide : ");
                sc.reset();
                sc=new Scanner(System.in);
                couleur[i]=sc.nextLine();
            }
        }
        return couleur;
    }
    public int SimilitudePosi(Combinaisons cc,Combinaisons c){// donne le nombre de coleur à la bonne position
        posi=0;
        for (int i=0;i<4;i++){
            if (cc.couleur[i].equals(c.couleur[i])){
                posi+=1;
            }
        }
        return posi;
    }
    
    public int SimilitudeCoul(Combinaisons cc,Combinaisons c){//donne le nombre de couleur en commun avec la combinaison à trouver
        coul=0;
        //initialisation d'un tableau qui permet de connaitre s'il y a deux fois la mêm couleur dans la combinaison à trouver
        int [] c2 = new int[4];
        int [] c1 = new int[4];//on fait le même chose pour les combinaisons courantes pour véiter les doublons
        for (int l=0;l<4;l++){
            for (int v=l+1;v<4;v++){
                if (c.couleur[l].equals(c.couleur[v])){
                    c2[l]=1;
                }
                if (cc.couleur[l].equals(cc.couleur[v])){
                    c1[l]=1;
                }
            }
        }
        for (int i=0;i<4;i++){
            if(c1[i]==1){
                continue;
            }
            for (int j=0;j<4;j++){
                if (c2[j]==1){ //s'il y a deux fois la même couleur alors l'algo ne va passer à la prochaine proposition de couleur
                    continue;
                }
                if (cc.couleur[i].equals(c.couleur[j])){
                    coul+=1;
                }
            }
        }
        return coul;
    }
    
    public boolean combiGagnante(Combinaisons cc,Combinaisons c){ //dit si la combinaison du joueur estla meme que celle à trouver
        if (SimilitudePosi(cc,c)==4 && SimilitudeCoul(cc,c)==4){
            return true;
        }
        return false;
    }
}
