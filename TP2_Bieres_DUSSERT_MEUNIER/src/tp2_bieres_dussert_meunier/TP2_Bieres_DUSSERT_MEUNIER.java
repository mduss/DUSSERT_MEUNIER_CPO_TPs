/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dussert_meunier;

/**
 *
 * @author Marine
 */
public class TP2_Bieres_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson");
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        BouteilleBiere cre1Biere = new BouteilleBiere("Pelforth", 5.8,"Brasserie du Pélican") ;
        BouteilleBiere cre2Biere = new BouteilleBiere("Heineken", 5.0,"Heineken") ;
        BouteilleBiere cre3Biere = new BouteilleBiere("Kronembourg", 4.2,"Carlsberg") ;
 
        
        uneBiere.Décapsuler();
        cre2Biere.Décapsuler();
        
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(cre1Biere);
        System.out.println(cre2Biere);
        System.out.println(cre3Biere);
        
    }
    
} 
