package ee.tlu.sl.kt2;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Veeb {
    
    @RequestMapping("/atahed")
    String[][] aTahed(String lause) {
        String[][] arr; 
        Lause l = new Lause(lause);
        arr = new String[l.getWordCount()][l.getWordCount()];
        int i = 0;
        for (Sõna s: l.getWords()) {
            arr[i][0] = s.sisend;
            arr[i][1] = Long.toString(s.getLetter('a'));
            i++;
        }
        return arr;
    } // http://localhost:8080/atahed?lause=mesilane%20aias
    
    public static void main(String[] arg){
         SpringApplication.run(Veeb.class, arg);
    }
}
