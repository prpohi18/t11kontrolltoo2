package teinekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class Spring {

    @RequestMapping("/nootideAndmine")
    String noodikesed(String noot1){
        if("C".equals(noot1)){
            CKolmkola ck = new CKolmkola();
            return ck.toString();
        }
        return "Whopsiedaisy";
    }

    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40408);
        SpringApplication.run(Spring.class, args);
    }
}