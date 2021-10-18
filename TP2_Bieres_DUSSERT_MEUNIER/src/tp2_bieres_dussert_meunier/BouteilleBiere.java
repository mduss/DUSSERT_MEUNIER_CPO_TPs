package tp2_bieres_dussert_meunier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marine
 */
public class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String brasserie;
    Boolean ouverte;
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        Nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    
    public boolean Décapsuler() {
        if (ouverte==false){
            ouverte=true;
            return true;
        }
        else {
            System.out.println("erreur : bière déja ouverte");
            return false;
        }
    }
}
