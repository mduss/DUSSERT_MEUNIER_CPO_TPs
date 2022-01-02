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
    
    int essai; // le nombre de tentatives
    Affichage grille; // un affichage de jeu
    Combinaisons combiCourante; //la combinaison que choisi celui qui devine
    Combinaisons combinaison;//la combinaison à deviner
   
    public void CommencerPartieSeul(){
        grille= new Affichage(); //on crée une nouvelle grille
        essai=0; // on ilitialise la variable des tentatives à 0
        Scanner sc=new Scanner(System.in);
        combinaison= new Combinaisons(grille.initialiserCombiAléat()); //on créé une combinaison aléatoire que le joueur va devoir deviner
        String [] couleur= new String[4]; //on créé un tableau qui contiendra les couleurs des combinaisons tenté à a chaque tentative
        
        grille.affichageJeu();// on affiche la grille
        //choisir combi
        System.out.println("Choisissez votre combinaison de couleurs !");
        couleur=grille.Combi(); // on demande à l'utilisateur de choisir une combinaison
        combiCourante =new Combinaisons(couleur);//la combinaison est associé à un objet combiCourante de type Combinaisons
        int posi=grille.SimilitudePosi(combiCourante,combinaison); // on demande le nombre de similitude par rapport à la position 
        int coul=grille.SimilitudeCoul(combiCourante,combinaison);// et le nombre de couleurs en commun
        grille.tableaux(essai, posi, coul, combiCourante);//les tableaux qui permettent de créer la grille sont mis à jour avec la nouvelle combinaison saisi et les similitudes
        essai++;// on passe à l'essai suivant
        
        while(grille.combiGagnante(combiCourante,combinaison)==false && essai<12){ // création d'une boucle qui s'exécute tant que la combinaison courante n'est pas gagnante ou que le nombre d'essai est inférieur à 12
            //cette boucle utilise le même principe que pour la 1e combinaison Courante
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
        grille.tableaux(essai-1, posi, coul, combiCourante); // on met à jour les tableaux qui permettent d'afficher la grille
        grille.affichageJeu();//on affiche la grille final du jeu 
        if(essai<=11){ // si le joueur à fait moins de 12 tentatives il à gagner
            System.out.println("Vous avez trouvé la bonne combianaison au bout de "+essai+" essais !");
        }
        else { //sinon il a perdu
            System.out.println("Vous avez perdu :'(");
        }
    }
    
    public void CommencerPartie(Joueur j1,Joueur j2){//à peu près le meme principe mais pour jouer à 2
        grille= new Affichage(); //la grille de jeu est créé
        essai=0; //le nombre de tentative initialisé
        Scanner sc=new Scanner(System.in);
        System.out.println(j2.Nom+" choisissez la combianaison à retrouver sans lui montrer");
        combinaison= new Combinaisons(grille.Combi());// le 2e joueur va créer une combinaison que le joueur va devoir retrouver
        System.out.println(j1.Nom+", c'est à vous de jouer");
        String [] couleur= new String[4];
        
        grille.affichageJeu();//le jeu s'affiche
        //choisir combi // c'est exactement le même principe que dans la méthode précédente
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
        j1.essai=essai;// on enregistre combien le joueurqui devinait la combinaison à effectuer de tentatives pour déterminer le gagnant après
    }
}
