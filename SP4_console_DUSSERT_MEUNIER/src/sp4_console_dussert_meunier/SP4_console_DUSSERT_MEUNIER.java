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
public class SP4_console_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Joueur j1 =new Joueur("Marine");
        Joueur j2 =new Joueur("Mathilde");
        
        Partie partie = new Partie(j1,j2);
        partie.initialiserPartie();
        partie.debuterPartie();
        
     
    }
     
    
}
