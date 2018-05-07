package joonevorrand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebService {
    
    public static String y;
    
    @RequestMapping("/arvutamine")
    String korrutamine(double kordaja, double x, double vabaliige) {

        if (vabaliige == 0) {
            y = Double.toString(Arvutamine.arvutaKordajaga(kordaja, x));
        } else {
            y = Double.toString(ArvutamineVabaliikmega.arvutaVabaliikmega(kordaja, x, vabaliige));
        }
        
        return "Y-koordinaat: " + y;
    }
   
    public static void main(String[] args) {
		System.getProperties().put("server.port", 40404);
        SpringApplication.run(WebService.class, args);
    }
}

//java -jar -Dserver.port=40404 target/testid-1.jar
//http://greeny.cs.tlu.ee:40404/