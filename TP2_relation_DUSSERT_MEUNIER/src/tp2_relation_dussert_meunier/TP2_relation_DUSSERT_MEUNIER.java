/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_relation_dussert_meunier;

/**
 *
 * @author dussert meunier
 */
public class TP2_relation_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code  application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
                
        bob.liste_voitures [0] = uneClio;
        bob.liste_voitures [1] = uneMicra;
        reno.liste_voitures [0] = une2008;
        reno.liste_voitures [1] = uneAutreClio;
        bob.nbVoitures = 2;
        reno.nbVoitures = 2;
        uneMicra.proprietaire = bob;
        uneClio.proprietaire = bob;
        une2008.proprietaire = reno;
        uneAutreClio.proprietaire = reno;
        
        System.out.println("les " + bob.nbVoitures + " voiture de Bob sont une " + bob.liste_voitures[0] + " et une " +  bob.liste_voitures[1]) ;
        System.out.println("les " + reno.nbVoitures + " voiture de reno sont une " + reno.liste_voitures[0] + " et une " +  reno.liste_voitures[1]) ;

    
    }
    
}
