/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_manip_dussert_meunier;

/**
 *
 * @author dusse
 */
public class TP2_manip_DUSSERT_MEUNIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        //2 assiettes ont été créé : assiette2=assiette3
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        
        assiette2=assiette1;
        assiette1=assiette3;
        System.out.println("nb de calories de Assiette 1 : " +
        assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        
        // 6)la 1e me parrait juste
        // non elle ne peut paas référencer un autre qui n'a aucun rapport
        
        //7)
       
       
        Moussaka m1=new Moussaka(10);Moussaka m2=new Moussaka(20);
        Moussaka m3=new Moussaka(30);Moussaka m4=new Moussaka(40);
        Moussaka m5=new Moussaka(50);Moussaka m6=new Moussaka(60);
        Moussaka m7=new Moussaka(70);Moussaka m8=new Moussaka(80);
        Moussaka m9=new Moussaka(90);Moussaka m10=new Moussaka(100);
        String [] Tab={"m1","m2","m3","m4","m5","m6","m7","m8","m9","m10"};
        
    }
}
