package kt2;

import java.util.Scanner;

public class Pendel {
    
   public static void main(String[] args) throws Exception{
       double vonkeperiood;
       try (Scanner reader = new Scanner(System.in)) {
           System.out.println("Sisesta pendli pikkus sentimeetrites: ");
           int pikkus = reader.nextInt();
           vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus / 9.8);
           System.out.print("Võnkeperiood on: "+ vonkeperiood +"\n");
       }
		
	Hambad h=new Hambad(0, 25);
		
	while (true) {
    	Thread.sleep((long)(vonkeperiood * 1000) / 2);
		System.out.println("Toimus poolvõnge");
		Thread.sleep((long)(vonkeperiood * 1000) / 2);
		System.out.println("Toimus täisvõnge");
		h.suurendahammastearv();
		if (h.loetudhambad == 25){
			System.out.println("Toimus hammasrattal täisring");
		}
	}
    }
}
