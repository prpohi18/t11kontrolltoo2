package ee.tlu.egert112.kt;

public class Pendel {
    public static void main(String[] args){
	double PEpikkus;
	double Võnkeperiood;
	PEpikkus = 100;
	Võnkeperiood = 2*(Math.PI)*(Math.sqrt(PEpikkus/9.8));
	System.out.println(Võnkeperiood);
    }
}
