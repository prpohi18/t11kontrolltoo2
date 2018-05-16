package javakt2;

import java.util.Scanner;
import javakt2.arvutused;

public class KT2testikas {
   
    public static void main(String[] args) {
        //loon uue pohitooni
        arvutused uusPohikola = new arvutused();
        
        //kysin pohitooni v22rtust
        Scanner name = new Scanner(System.in);
        System.out.println("Sisesta p6hitoon (1-127)");
        String toon = name.nextLine();
        int nr = Integer.parseInt(toon); //string to int
        System.out.println("Sisestasid pohitooniks: " +nr);  
        
        //saadan v22rtuse konstruktorisse
        uusPohikola.sisestamine(nr);
        
        //v2ljastan kolmkola
        uusPohikola.valjastamine();
        

        
    }
    
}
