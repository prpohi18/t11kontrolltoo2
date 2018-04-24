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
import java.util.Timer;
import java.util.TimerTask;

public class Kt2 {

	public static void main(String[] args){
	double pikkus;
	double Vonkeperiood;
	pikkus = 100;
	Vonkeperiood = 2*(Math.PI)*(Math.sqrt(pikkus/9.8));
	System.out.println(Vonkeperiood);
	
        class PendliPeriud extends TimerTask {
         int c = 0;
         int k = 0;
         int hammasteArv = 4;
         
         public void run() {
            if( c == 0){
                System.out.println("tik!"); 
                c=1;
                k++;
            }else{
                System.out.println("tak!"); 
                c = 0;
                k++;
            }
            if(k == hammasteArv){
                System.out.println("Tehtud ring");
                //naitab iga 4 
                k=0;
            }
         }
        }
            Timer timer = new Timer();
            timer.schedule(new PendliPeriud(), 0, (int)Math.round(Vonkeperiood*100));
	}
}
