package tp2_convertisseurobjet_dussert_meunier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dusse
 */
public class Convertisseur {
    int nbConversions=0;
    
    public double CelciusVersKelvin (double tempCelcius) {     
        double c =tempCelcius+273;
        return c ;
    }
    
    public double KelvinVersCelcius (double tempKelvin) {     
        double c =tempKelvin-273;
        return c;
    }
    
    public double FarenheitVersCelcius (double tempFara) {     
        double c =(tempFara-32)*(5.0/9);
        return c;
    }
    public double CelciusVersFarenheit (double tempCelcius) {     
        double c =tempCelcius*(9/5.0)+32;
        return c;
    }
    public double KelvinVersFarenheit (double tempKelvin) {     
        double c =(tempKelvin-273)*(9/5.0)+32;
        return c;
    }
    public double FarenheitVersKelvin (double tempFara) {     
        double c =(tempFara-32)*(9/5.0)+273;
        return c;
    }
    @Override
    public String toString() {
        return "nb de conversions : "+nbConversions;
    }
}
