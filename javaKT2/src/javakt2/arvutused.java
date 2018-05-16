package javakt2;

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
 
    
}
    


