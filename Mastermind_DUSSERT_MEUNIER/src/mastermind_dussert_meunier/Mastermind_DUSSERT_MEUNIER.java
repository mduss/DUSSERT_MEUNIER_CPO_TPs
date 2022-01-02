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
public class Mastermind_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Partie partie=new Partie();// création dune nouvelle partie
        //choix de la partie (solo ou à deux)
        System.out.println("Voulez vous jouer seul ou à deux ? (1/2)");
        int rep = sc.nextInt();
        if (rep==1){ //partie solo
            partie.CommencerPartieSeul();
        }
        else if (rep==2){//partie à 2 joueurs
            //création et initialisation des deux joueurs avec leur noms
            Joueur j1 = new Joueur() ;
            System.out.println("Tapez le nom du 1e joueur :");
            sc.reset();
            sc=new Scanner(System.in);
            String joueur = sc.nextLine();
            j1.Nom=joueur;
            Joueur j2 = new Joueur();
            System.out.println("Tapez le nom du 2e joueur :");
            joueur = sc.nextLine();
            j2.Nom=joueur;
            // description du déroulemnt d'une partie
            System.out.println("La partie se déroulera de la façon suivante : "
                    + "\nUnjouer va déterminer une combinaison de 4 couleurs et ensuite le 1e joueur devra la deviner en 12 tentatives"
                    + "\nEnsuite les roles s'inverssent : celui qui devinait (1e joueur) va établir la combinaison à faire deviner au 2e joueur");
            partie.CommencerPartie(j1,j2); // le 1e joueur va deviner la combinaison que le 2e aura choisi
            System.out.println("ON INVERSE LES ROLES !");
            partie.CommencerPartie(j2,j1); // cette fois ci le 2e joueur va deviner la combinaison que le 1e aura choisi
            //le joueur qui à deviner en effectuant le moins de tentatives à gagner
            if (j1.essai>j2.essai){
                System.out.println("C'est "+j2.Nom+" qui a gagné");
            }
            else if (j1.essai<j2.essai){
                System.out.println("C'est "+j1.Nom+" qui a gagné");
            }
            else { //il peut y avoir égalité
                System.out.println("Egalité entre "+j1.Nom+" et "+j2.Nom+" !");
            }  
        }
    }
    
}
