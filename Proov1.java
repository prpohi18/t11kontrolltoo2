/*public class Proov1{
    public static void main(String[] args){
        Jogi j1=new Jogi();
        j1.nimetus="Pirita jõgi";
        Jogi j2=new Jogi();
        j2.nimetus="Kuivajõgi";
        Jogi j3=new Jogi();
        j3.nimetus="Kirivalla oja";
        j3.pikkus=10; //km
        j3.sihtjogi=j2;
        j3.suudmeKaugusSihtjoeSuudmest=12;
        j2.pikkus=20;
        j2.sihtjogi=j1;
        j1.pikkus=100;
        j2.suudmeKaugusSihtjoeSuudmest=50;
        j1.sihtjogi=null;
        Jogi uuritav=j3;
        double kogukaugus=uuritav.pikkus;
        while(uuritav!=null){
            System.out.println(uuritav.nimetus);
            kogukaugus+=uuritav.suudmeKaugusSihtjoeSuudmest;
            uuritav=uuritav.sihtjogi;                             
        }
        System.out.println(kogukaugus);
        System.out.println(j3.kaugusMereni(8));
        System.out.println(j3.nimedMereni());
        
    }
}
*/

import java.lang.Math;
import static java.lang.Math.PI;
import java.util.Timer;
import java.util.TimerTask;

public class Proov1{
    public static void main(String[] args){
		double vonkeperiood, pikkus;
		pikkus = 1;
		vonkeperiood = Vonkeperiood.vp(pikkus);
		System.out.println(vonkeperiood);
		
		class vonkeperiood extends TimerTask {
			int a = 0,b = 0,c = 0,hammasrattas2 = 60,hammasrattas1 = 60, min = 1, tund = 1, sec = 1;
			public void run() {
				//if (a == 0){
				//	System.out.println("Tik!");
				//	a = 1;
				//} else {
				//	System.out.println("Tak!");	
				//	a = 0;
				//};
				b ++;
				if (b == hammasrattas1){
					System.out.println("Minut");
					b = 0;
					c ++;
				}
				if (c == hammasrattas2){
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
				System.out.println ("Esimene hammas rattas on pöördunud " + 360/60*sec + " kraadi");
				System.out.println ("Teine " + 360/60*min+ " kraadi");
				System.out.println ("Kolmas " + 360/60 * tund + " kraadi");
			}
		}
		Timer timer = new Timer();
		timer.schedule(new vonkeperiood(), 0, (int) Math.round(vonkeperiood*100));
	}
}