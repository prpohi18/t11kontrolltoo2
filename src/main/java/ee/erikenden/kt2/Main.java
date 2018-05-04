package ee.erikenden.kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static int baseNote;
    public static int numberOfBars;
    public static void main( String[] args )
    {
        SpringApplication.run(Spring.class, args);
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.print( "Sisesta kolmkõla baasnoot: " );
        baseNote = sc.nextInt();

        Tritone tri = new Tritone(baseNote);
        int difFromC = tri.differenceFromC(baseNote);
        String noteLet = tri.convertToLetter(difFromC);
        CTritone ctri = new CTritone();
        FTritone ftri = new FTritone();
        GTritone gtri = new GTritone();
        System.out.println("Baasnoot tähena: " + tri.baseLet);
        System.out.println("Suur terts tähena: " + tri.mtLet);
        System.out.println("Kvint tähena: " + tri.perfLet);
        System.out.println("Baasnoot uuesti numbrina: " + tri.convertToFreq(noteLet));
        System.out.println("Kolmkõla: " + baseNote + "hz " + tri.majorThird + "hz " + tri.perfectFifth + "hz");
        System.out.println("C kolmkõla: " + ctri.base + "hz " + ctri.majorThird + "hz " + ctri.perfectFifth + "hz");
        System.out.println("F kolmkõla: " + ftri.base + "hz " + ftri.majorThird + "hz " + ftri.perfectFifth + "hz");
        System.out.println("G kolmkõla: " + gtri.base + "hz " + gtri.majorThird + "hz " + gtri.perfectFifth + "hz");
        System.out.println("Sisesta taktide arv: ");
        numberOfBars = sc.nextInt();
        System.out.print("Tähed või numbrid? 0 - numbrid, 1 - tähed");
        int letOrNum = sc.nextInt();
        Song song = new Song(numberOfBars, letOrNum);
    }
}
