/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakt2;

/**
 *
 * @author Kaur
 */
public class arvutused {
    public static int pohitoon;
    public static int terts;
    public static int kvint;

    //pohikola sisestamise ning kvinti ja tertsi arvutamise konstruktor
    public void sisestamine(int sisestaPohitoon){
        this.pohitoon = sisestaPohitoon;
        this.kvint = sisestaPohitoon+4;
        this.terts = sisestaPohitoon+7;
    }
    
    //kolmkola valjastamise konstruktor
    public void valjastamine(){
        System.out.println(pohitoon+" "+kvint+" "+terts);
    }
    
    public void valjastaTerts(){
        System.out.println(terts);
    }
  
    public void valjastaKvint(){
        System.out.println(kvint);
    }
 
    
}
    


