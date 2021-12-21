/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_dussert_meunier;

import java.util.Scanner;

/**
 *
 * @author dusse
 */
public class Partie {
    int essai;
    Combinaisons combinaison=new Combinaisons();
    Combinaisons combiCourante=new Combinaisons();
    Affichage grille= new Affichage();
    
    public void CommencerPartie(){
        Scanner sc=new Scanner(System.in);
        combinaison.initialiserCombi();
        String couleur;
        System.out.println("Choisissez votre combinaison de couleurs !");
        for (int i=0;i<4;i++){
            System.out.println("Couleur "+i+1+": \nSaisissez : \nro pour rouge \nbl pour bleu \nja pour jaune \nve pour vert \nvi pour violet \nwh pour blanc");
            sc.reset();
            sc=new Scanner(System.in);
            couleur=sc.nextLine();
            while (couleur!="bl"&&couleur!="ro"&&couleur!="ja"&&couleur!="ve"&&couleur!="vi"&&couleur!="wh"){
                System.out.println("Saisissez une couelur valide : ");
                sc.reset();
                sc=new Scanner(System.in);
                couleur=sc.nextLine();
            }
            combiCourante.couleur[i]=sc.nextLine();
        }
        while(combiCourante.combiGagnante()==false && essai<=12){
            grille.affichageJeu();
            //choisir combi
            System.out.println("Choisissez votre combinaison de couleurs !");
            for (int i=0;i<4;i++){
                System.out.println("Couleur "+i+1+": \nSaisissez : \nro pour rouge \nbl pour bleu \nja pour jaune \nve pour vert \nvi pour violet \nwh pour blanc");
                couleur=sc.nextLine();
                while ("bl"!=couleur&&"ro"!=couleur&&"ja"!=couleur&&"ve"!=couleur&&"vi"!=couleur&&"wh"!=couleur){
                    System.out.println("Saisissez une couelur valide : ");
                    couleur=sc.nextLine();
                }
                combiCourante.couleur[i]=sc.nextLine();
            }
            int posi =combiCourante.SimilitudePosi();
            int coul=combiCourante.SimilitudeCoul();
            grille.tableaux(essai, posi, coul, combiCourante);
            essai++;
        }
        if(essai<=12){
            System.out.println("Vous avez gagné au bout de "+essai+" essais !");
        }
        else {
            System.out.println("Vous avez perdu");
        }
    }
}
