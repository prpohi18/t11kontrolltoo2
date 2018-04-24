/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt2;

/**
 *
 * @author JustIFFI
 */
import java.lang.Math;
import static java.lang.Math.PI;
import java.util.Timer;
import java.util.TimerTask;

public class kt2_3{
    public static void main(String[] args){
	double Vonkeperiood;
        double pikkus;
        pikkus = 100;
	Vonkeperiood = 2*(Math.PI)*(Math.sqrt(pikkus/9.8));
	System.out.println(Vonkeperiood);
	class PendliPeriud extends TimerTask {
            int a = 0;
            int hammasteArv = 60;
            int hammasteArv2 = 60;
            int b = 0;
            int c = 0;
            int sec = 0;
            int min = 0;
            int tund = 0;
            public void run() {
		b ++;
		if (b == hammasteArv){
                    System.out.println("Min");
                    b = 0;
                    c ++;
		}
		if (c == hammasteArv2){
                    System.out.println("Tund");
                    c = 0;
		}
                if (sec == 60){
                    sec = 0;
                    min ++;
                    if (min == 60){
                        min = 0;
                        tund ++;
                    }
		}
		sec ++;
		System.out.println (tund + ":" + min + ":" + sec);
		System.out.println ("Esimene poordunud" + 360/60*sec + " kraadi");
		System.out.println ("Teine poordunud " + 360/60*min+ " kraadi");
		System.out.println ("Kolmas poordunud " + 360/60 * tund + " kraadi");
			}
        }
		Timer timer = new Timer();
		timer.schedule(new PendliPeriud(), 0, (int) Math.round(Vonkeperiood*10));
	}
}
/*viited 
https://stackoverflow.com/questions/12908412/print-hello-world-every-x-seconds/12908477
*/