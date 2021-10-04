/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_dussert_meunier;

/**
 *
 * @author Marine
 */
public class ManipNombresInt_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("\nEntrer un premier entier :");

        int entier1 = sc.nextInt();
        
        System.out.println("\nEntrer unsecond entier :");

        int entier2 = sc.nextInt();
        
        
        System.out.println("Entier 1 : " + entier1 +"\nEntier 2 : " + entier2);
        int somme=entier1+entier2;
        System.out.println("La somme est : " + somme );
        int diff=entier1-entier2;
        System.out.println("La différence est : " + diff );
        int prod=entier1*entier2;
        System.out.println("Le produit est : " + prod );
        int quotient=entier1/entier2;
        int reste=entier1%entier2;
        
    }
    
}
