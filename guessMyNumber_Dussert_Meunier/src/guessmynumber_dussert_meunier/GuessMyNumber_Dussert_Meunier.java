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
        
        System.out.println("""
                           1) Facile
                           2) Normal
                           3) Difficile
                           4) Cauchemar
                           
                           Saisissez le numéro du niveau choisi :
                           """);
        int niv = sc.nextInt(); 
        
        if (1==niv) {
            int n = generateurAleat.nextInt(50);
            int saisi = sc.nextInt(); 
            int compt = 0;
            while (saisi!=n) {
                saisi = sc.nextInt();
                if (saisi<n) {
                    System.out.println("Trop petit");
                }
                else if (saisi>n) {
                    System.out.println("Trop grand");

                }
                compt+=1;
            }
        }
        
        else if (2==niv){
            int n = generateurAleat.nextInt(100);
            int saisi = sc.nextInt(); 
            int compt = 0;
            while (saisi!=n) {
                saisi = sc.nextInt();
                if (saisi<n) {
                    System.out.println("Trop petit");
                }
                else if (saisi>n) {
                    System.out.println("Trop grand");
                }
                compt+=1;
            }
        }
        
        
        System.out.println("Gagné à la tentative numéro " + compt);
        
        }
     
    }

        
    
}
