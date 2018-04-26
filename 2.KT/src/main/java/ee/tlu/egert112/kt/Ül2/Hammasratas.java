package ee.tlu.egert112.kt.Ül2;
import java.util.Timer;
import java.util.TimerTask;


public class Hammasratas {
    public static void main(String[] args){
        double PEpikkus;
        double Võnkeperiood;
        PEpikkus=100;
        Võnkeperiood = 2*(Math.PI)*(Math.sqrt(PEpikkus/9.8));
	System.out.println(Võnkeperiood);
    
    class pendliperiood extends TimerTask{
        int p=0;
        int Hammasratas=60;
        int o=0;
        //@Override
        
        public void run() {
            if ( p==0 ){
               System.out.println("1 sec!"); 
               p=1;
               o++;
            }else{
                System.out.println("1 sec!");
                p=0;
                o++;
            }
            if ( o== Hammasratas){
            System.out.println("Minut täis!");
            o=0;
            
        }
        
    
        }
    }
    Timer timer= new Timer();
        timer.schedule(new pendliperiood (), 0, (int)Math.round(Võnkeperiood*70));
    }
}
