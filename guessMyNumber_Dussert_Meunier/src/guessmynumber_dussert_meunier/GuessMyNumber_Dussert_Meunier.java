/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_dussert_meunier;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marine
 */
public class GuessMyNumber_Dussert_Meunier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1) Facile\n" + "2) Normal\n" + "3) Difficile\n" + "Saisissez le num\u00e9ro du niveau choisi :\n");
        int niv = sc.nextInt(); 
        
        if (1==niv){
            int n = generateurAleat.nextInt(50);
            System.out.println(n);
            System.out.println("Tentez votre chance, saisissez un nombre entre 0 et 50");
            int saisi = sc.nextInt(); 
            int compt = 1;
            while (saisi!=n) {
                if (saisi<n) {
                    System.out.println("Trop petit, réesayer");
                }
                else if (saisi>n) {
                    System.out.println("Trop grand, réessayer");
                }
                compt+=1;
                
                saisi = sc.nextInt();
            }
            System.out.println("Gagné à la tentative numéro " + compt);
        }
        
        else if (2==niv){
            int n = generateurAleat.nextInt(50);
            System.out.println(n);
            System.out.println("Tentez votre chance, saisissez un nombre entre 0 et 100");
            int saisi = sc.nextInt(); 
            int compt = 1;
            while (saisi!=n) {
                if (saisi<n) {
                    System.out.println("Trop petit, réesayer");
                }
                else if (saisi>n) {
                    System.out.println("Trop grand, réessayer");
                }
                compt+=1;
                saisi = sc.nextInt();
            }
            System.out.println("Gagné à la tentative numéro " + compt);
        }
        
        else if (3==niv){
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
            System.out.println("Tentez votre chance, saisissez un nombre entre 0 et 100 \nAttention vous n'avez que 20 tentatives !");
            int saisi = sc.nextInt(); 
            int compt = 1;
            while ((saisi!=n)||(compt<=20)) {
                System.out.println("Tentatve numéro : "+compt);
                if (saisi<n) {
                    System.out.println("Trop petit,réesayer");
                }
                else if (saisi>n) {
                    System.out.println("Trop grand,réesayer");
                }
                compt+=1;
                saisi = sc.nextInt();
            }
            if (saisi==n){
                System.out.println("Gagné à la tentative numéro " + compt);
            }
            else {
                System.out.println("Perdu à cause d'u trop grand nombre de tentatives");
            }
        }
     // fin jeu
    }

        
    
}
