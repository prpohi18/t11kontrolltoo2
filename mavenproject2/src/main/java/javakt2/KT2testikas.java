package javakt2;

import java.util.Scanner;
import javakt2.arvutused;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class KT2testikas {
  
    
    @RequestMapping("/nootideAndmine")
    public String korrutamine(String noot1){
        if("C".equals(noot1)){
            return "60";
        } else if ("F".equals(noot1)){
            return "65";
        } else if ("G".equals(noot1)){
            return "67";
        }

       return "Sisestasid vale akordi. Palun proovi uuesti ";
    }
    
    
    
    public static void main(String[] args) {
        SpringApplication.run(KT2testikas.class, args);

             
        //loon uue pohitooni
        arvutused uusPohikola = new arvutused();
        
        //kysin pohitooni v22rtust
        Scanner name = new Scanner(System.in);
        System.out.println("Sisesta p6hitoon (1-127)");
        String toon = name.nextLine();
        int nr = Integer.parseInt(toon); //string to int
        System.out.println("Sisestasid pohitooniks: " +nr);  
        
        //saadan v22rtuse konstruktorisse
        uusPohikola.sisestamine(nr);
        
        //v2ljastan kolmkola noodid
        uusPohikola.valjastamine();
        
        uusPohikola.valjastaTerts();
       
    }
    
}
