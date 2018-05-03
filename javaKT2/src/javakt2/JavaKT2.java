/*
Loo klass Kolmkõla mazoorkolmkõla nootide arvutamiseks. Konstruktoris antakse sisse täisarvuline põhitoon, eraldi käsuga väljastatakse põhitoon, suur terts (+4) ja kvint (+7). 
Ehk siis kui põhitooniks on 60(C), siis väljastatakse arvud 60 64 67. Loo toimimise kontrollimiseks automaattest.
*/

package javakt2;

import java.util.Scanner;

public class JavaKT2 {
    
    
    public static void main(String[] args) {
// Here will be program that gets input and gives  3-sound    
     Scanner name = new Scanner(System.in);
        System.out.println("Sisesta p6hitoon (1-127)");
        String toon = name.nextLine();
        int nr = Integer.parseInt(toon); //string to int
   // System.out.println(nr);    
    terts t1 = new terts(nr);
    
    System.out.println("P6hitoon on "+nr+", terts on "+t1.value);
    }
}
