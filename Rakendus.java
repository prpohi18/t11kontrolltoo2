package tlu.ee.kontrolltoo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication

public class Rakendus{
	
	@RequestMapping("/looAined")
    String looAined(String ioonid){
        Ioon[] ioonideKogum = aineStringist(ioonid);
        Massiiv a = new Massiiv(ioonideKogum);
        return "Aine nimetus on: "+a.kysiNimetus() + " ja mass on: " + a.kysiMolekulMass();
    }

    
    
	public static void main(String[] arg){
        SpringApplication.run(Rakendus.class, arg);
    } 
        
    public Ioon[] aineStringist(String str){
        String[] ioonidStr = str.split(",");
        Ioon[] ioonid = new Ioon[ioonidStr.length];
        int i = 0;
        for (String ioonStr : ioonidStr) {
            if(ioonStr.charAt(2)=='+'|| ioonStr.charAt(2)=='-'){
                if(ioonStr.charAt(2)=='+'){
                    Ioon ioon = new Ioon(ioonStr.substring(0,2), 1.0, 1);
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                } else{
                    Ioon ioon = new Ioon(ioonStr.substring(0,2), 1.0, -1);
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                }
                
            } else{
                if(ioonStr.charAt(3)=='+'){
                    Ioon ioon = new Ioon(ioonStr.substring(0,2),Double.parseDouble(ioonStr.substring(2,3)), Integer.parseInt(ioonStr.substring(2,3)));
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                } else{
                    Ioon ioon = new Ioon(ioonStr.substring(0,2),Double.parseDouble(ioonStr.substring(2,3)), Integer.parseInt(ioonStr.substring(2,3))*-1);
                    
                    ioonid[i]= ioon;
                    System.out.println(ioon.toString());
                    i++;
                }
            }
        }
        return ioonid;
    }
       
}