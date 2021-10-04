/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_dussert_meunier;

import java.util.Scanner;

/**
 *
 * @author Marine
 */
public class Convertisseur_DUSSERT_MEUNIER {

    public static double CelciusVersKelvin (double tempCelcius) {     
        double c =tempCelcius+273;
        return c;
    }
    
    public static double KelvinVersCelcius (double tempKelvin) {     
        double c =tempKelvin-273;
        return c;
    }
    
    public static double FarenheitVersCelcius (double tempFara) {     
        double c =(tempFara-32)*(5.0/9);
        return c;
    }
    public static double CelciusVersFarenheit (double tempCelcius) {     
        double c =tempCelcius*(9/5.0)+32;
        return c;
    }
    public static double KelvinVersFarenheit (double tempKelvin) {     
        double c =(tempKelvin-273)*(9/5.0)+32;
        return c;
    }
    public static double FarenheitVersKelvin (double tempFara) {     
        double c =(tempFara-32)*(9/5.0)+273;
        return c;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Partie 2 :
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");

        double reel = sc.nextFloat(); 
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin
                           """);
        int convert = sc.nextInt();
        if (1==convert) {
            System.out.println("Le température en Celcius est : " + reel );
            double Kelvin=CelciusVersKelvin(reel);
            System.out.println("La température en Kelvin est : " + Kelvin );
        }
        else if (2==convert) {
            System.out.println("Le température en Kelvin est : " + reel );
            double Kelvin=KelvinVersCelcius(reel);
            System.out.println("La température en Celcius est : " + Kelvin );
        }       
        else if (3==convert) {
            System.out.println("Le température en Farenheit est : " + reel );
            double Kelvin=FarenheitVersCelcius(reel);
            System.out.println("La température en Celcius est : " + Kelvin );
        }       
        else if (4==convert) {
            System.out.println("Le température en Celcius est : " + reel );
            double Kelvin=CelciusVersFarenheit(reel);
            System.out.println("La température en Farenheit est : " + Kelvin );
        }   
        else if (5==convert) {
            System.out.println("Le température en Kelvin est : " + reel );
            double Kelvin=KelvinVersFarenheit(reel);
            System.out.println("La température en Farenheit est : " + Kelvin );
        }      
        else if (6==convert) {
            System.out.println("Le température en Farenheit est : " + reel );
            double Kelvin=FarenheitVersKelvin(reel);
            System.out.println("La température en Kelvin est : " + Kelvin );
        }   
    }
    
}
