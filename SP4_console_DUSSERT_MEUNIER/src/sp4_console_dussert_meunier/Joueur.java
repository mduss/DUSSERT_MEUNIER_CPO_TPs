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
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons;
    int nombreDésintégrateur ;
    int nombreJetonsRestants;
    public Joueur(String nom){
        Nom=nom;
    }
    public void affecterCouleur(String couleur){
        Couleur=couleur;
    }
    public Jeton ajouterJeton(String JetonJoueur) {
        ListeJetons[21-nombreJetonsRestants]=JetonJoueur;     
    }
    public void obtenirDesintegrateur() {
        nombreDésintégrateur+=1;
    }
    public void utiliserDesintegrateur(){
        nombreDésintégrateur-=1;
    }
}
