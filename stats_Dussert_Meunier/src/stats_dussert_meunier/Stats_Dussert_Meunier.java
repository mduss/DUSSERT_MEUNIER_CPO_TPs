/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_dussert_meunier;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marine
 */
public class Stats_Dussert_Meunier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        Random generateurAleat = new Random();
        
        double Tab[]= new double[6];
        
        System.out.println("Saisissez un nombre entier");
        int m = sc. nextInt();
        
        for (int i=0 ; i<m ; i++) {
            int n = generateurAleat.nextInt(6);
            Tab[n]+=1;
        }
        System.out.println(Arrays.toString(Tab));

        for (int i=0; i<Tab.length; i++) {
            Tab[i]=(Tab[i]/m)*100;
            System.out.print(Tab[i] + " ");
        }
    }
    
}

