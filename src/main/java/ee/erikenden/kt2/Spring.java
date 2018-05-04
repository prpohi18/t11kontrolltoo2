package ee.erikenden.kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
@RestController
@SpringBootApplication
public class Spring {
    CTritone ctri = new CTritone();
    FTritone ftri = new FTritone();
    GTritone gtri = new GTritone();
    @RequestMapping("/tritones.html/CTri0")
    public int[] CTri(){
        int [] tones;
        tones = new int[3];
        tones[0] = ctri.base;
        tones[1] = ctri.majorThird;
        tones[2] = ctri.perfectFifth;
        return tones;
    }
    @RequestMapping("/tritones.html/CTri1")
    public String[] Ctrinum(){
        String[] tones;
        tones = new String[3];
        tones[0] = ctri.convertToLetter(ctri.differenceFromC(ctri.base));
        tones[1] = ctri.convertToLetter(ctri.differenceFromC(ctri.majorThird));
        tones[2] = ctri.convertToLetter(ctri.differenceFromC(ctri.perfectFifth));
        return tones;
    }
    @RequestMapping("/tritones.html/FTri0")
    public int[] FTri(){
        int [] tones;
        tones = new int[3];
        tones[0] = ftri.base;
        tones[1] = ftri.majorThird;
        tones[2] = ftri.perfectFifth;
        return tones;
    }
    @RequestMapping("/tritones.html/FTri1")
    public String[] Ftrinum(){
        String[] tones;
        tones = new String[3];
        tones[0] = ftri.convertToLetter(ftri.differenceFromC(ftri.base));
        tones[1] = ftri.convertToLetter(ftri.differenceFromC(ftri.majorThird));
        tones[2] = ftri.convertToLetter(ftri.differenceFromC(ftri.perfectFifth));
        return tones;
    }
    @RequestMapping("/tritones.html/GTri0")
    public int[] GTri(){
        int [] tones;
        tones = new int[3];
        tones[0] = gtri.base;
        tones[1] = gtri.majorThird;
        tones[2] = gtri.perfectFifth;
        return tones;
    }
    @RequestMapping("/tritones.html/GTri1")
    public String[] Gtrinum(){
        String[] tones;
        tones = new String[3];
        tones[0] = gtri.convertToLetter(gtri.differenceFromC(gtri.base));
        tones[1] = gtri.convertToLetter(gtri.differenceFromC(gtri.majorThird));
        tones[2] = gtri.convertToLetter(gtri.differenceFromC(gtri.perfectFifth));
        return tones;
    }
}
