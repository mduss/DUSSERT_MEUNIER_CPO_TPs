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
    Affichage grille;
    Combinaisons combiCourante;
    Combinaisons combinaison;
   
    public void CommencerPartieSeul(){
        grille= new Affichage();
        essai=0;
        Scanner sc=new Scanner(System.in);
        combinaison= new Combinaisons(grille.initialiserCombiAléat());
        String [] couleur= new String[4];
        
        grille.affichageJeu();
        //choisir combi
        System.out.println("Choisissez votre combinaison de couleurs !");
        couleur=grille.Combi();
        combiCourante =new Combinaisons(couleur);
        int posi=grille.SimilitudePosi(combiCourante,combinaison);
        int coul=grille.SimilitudeCoul(combiCourante,combinaison);
        grille.tableaux(essai, posi, coul, combiCourante);
        essai++;
        
        while(grille.combiGagnante(combiCourante,combinaison)==false && essai<12){
            grille.affichageJeu();
            //choisir combi
            System.out.println("Choisissez votre combinaison de couleurs !");
            couleur=grille.Combi();
            combiCourante =new Combinaisons(couleur);
            posi =grille.SimilitudePosi(combiCourante,combinaison);
            coul=grille.SimilitudeCoul(combiCourante,combinaison);
            grille.tableaux(essai, posi, coul, combiCourante);
            essai++;
        }
        grille.tableaux(essai-1, posi, coul, combiCourante);
        grille.affichageJeu();
        if(essai<=11){
            System.out.println("Vous avez trouvé la bonne combianaison au bout de "+essai+" essais !");
        }
        else {
            System.out.println("Vous avez perdu :'(");
        }
    }
    
    public void CommencerPartie(Joueur j1,Joueur j2){
        grille= new Affichage();
        essai=0;
        Scanner sc=new Scanner(System.in);
        System.out.println(j2.Nom+" choisissez la combianaison à retrouver sans lui montrer");
        combinaison= new Combinaisons(grille.Combi());
        System.out.println(j1.Nom+", c'est à vous de jouer");
        String [] couleur= new String[4];
        
        grille.affichageJeu();
        //choisir combi
        System.out.println(j1.Nom+" choisissez votre combinaison de couleurs !");
        couleur=grille.Combi();
        combiCourante =new Combinaisons(couleur);
        int posi=grille.SimilitudePosi(combiCourante,combinaison);
        int coul=grille.SimilitudeCoul(combiCourante,combinaison);
        grille.tableaux(essai, posi, coul, combiCourante);
        essai++;
        
        while(grille.combiGagnante(combiCourante,combinaison)==false && essai<12){
            grille.affichageJeu();
            //choisir combi
            System.out.println(j1.Nom+" choisissez votre combinaison de couleurs !");
            couleur=grille.Combi();
            combiCourante =new Combinaisons(couleur);
            posi =grille.SimilitudePosi(combiCourante,combinaison);
            coul=grille.SimilitudeCoul(combiCourante,combinaison);
            System.out.print(posi);System.out.print(coul);
            grille.tableaux(essai, posi, coul, combiCourante);
            essai++; 
        }
        grille.tableaux(essai-1, posi, coul, combiCourante);
        grille.affichageJeu();
        if(essai<=11){
            System.out.println(j1.Nom+", vous avez trouvé la bonne combianaison au bout de "+essai+" essais !");
        }
        else {
            System.out.println(j1.Nom+", vous avez perdu :'(");
        }
        j1.essai=essai;
    }
}
