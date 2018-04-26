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
    Map aTahed(String lause) {
        Map<String,Long> map=new HashMap<>();  
        Lause l = new Lause(lause);
        for (Sõna s: l.getWords()) {
            map.put(s.sisend, s.getLetter('a'));
        }
        
    } //http://localhost:8080/atahed?lause=mesilane%20aias
    
    public static void main(String[] arg){
         SpringApplication.run(Veeb.class, arg);
    }
}
