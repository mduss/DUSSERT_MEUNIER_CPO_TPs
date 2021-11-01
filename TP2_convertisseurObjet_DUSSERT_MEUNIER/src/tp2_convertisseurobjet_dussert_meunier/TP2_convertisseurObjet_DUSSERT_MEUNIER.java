/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dussert_meunier;

import java.util.Scanner;
/**
 *
 * @author Marine
 */
public class TP2_convertisseurObjet_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TOD9O code application logic here
        Scanner sc=new Scanner(System.in);
        
        int a=100;
        Convertisseur objet1 = new Convertisseur();
        Convertisseur objet2 = new Convertisseur();
        
        System.out.println("""
                           Saisissez les conversions que vous souhaitez effectuer pour objet 1:
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin
                           """);
        int convert = sc.nextInt();
        while (1<=convert && convert<=6){
            if (1 == convert) {
                objet1.CelciusVersFarenheit(a);
            }
            else if (2==convert) {
                objet1.KelvinVersCelcius(a);
            }       
            else if (3==convert) {
                objet1.FarenheitVersCelcius(a);
            }       
            else if (4==convert) {
                objet1.CelciusVersFarenheit(a);
            }   
            else if (5==convert) {
                objet1.KelvinVersFarenheit(a);
            }      
            else if (6==convert) {
                objet1.FarenheitVersKelvin(a);
            } 
            convert = sc.nextInt();
        }
        
        System.out.println("""
                           Saisissez les conversions que vous souhaitez effectuer pour objet 2:
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin
                           """);
        int convert2 = sc.nextInt();
        while (1<=convert2 && convert2<=6){
            if (1 == convert2) {
                objet2.CelciusVersFarenheit(a);
            }
            else if (2==convert2) {
                objet2.KelvinVersCelcius(a);
            }       
            else if (3==convert2) {
                objet2.FarenheitVersCelcius(a);
            }       
            else if (4==convert2) {
                objet2.CelciusVersFarenheit(a);
            }   
            else if (5==convert2) {
                objet2.KelvinVersFarenheit(a);
            }      
            else if (6==convert2) {
                objet2.FarenheitVersKelvin(a);
            }
            convert2= sc.nextInt();
        }
        
        System.out.println("Objet1-> "+objet1);
        System.out.println("Objet2-> "+objet2);
    
    }
    
}
