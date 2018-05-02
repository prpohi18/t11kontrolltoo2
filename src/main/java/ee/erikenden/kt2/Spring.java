package ee.erikenden.kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
@RestController
@SpringBootApplication
public class Spring {
    CTritone ctri = new CTritone();
    FTritone ftri = new FTritone();
    GTritone gtri = new GTritone();
    @RequestMapping("/tritones.html/CTri")
    public int[] CTri(){
        int [] tones;
        tones = new int[3];
        tones[0] = ctri.base;
        tones[1] = ctri.majorThird;
        tones[2] = ctri.perfectFifth;
        return tones;
    }
    @RequestMapping("/tritones.html/FTri")
    public int[] FTri(){
        int [] tones;
        tones = new int[3];
        tones[0] = ftri.base;
        tones[1] = ftri.majorThird;
        tones[2] = ftri.perfectFifth;
        return tones;
    }
    @RequestMapping("/tritones.html/GTri")
    public int[] GTri(){
        int [] tones;
        tones = new int[3];
        tones[0] = gtri.base;
        tones[1] = gtri.majorThird;
        tones[2] = gtri.perfectFifth;
        return tones;
    }
}
