package geenid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Rakendus{

    @Autowired
    private GeenDAO geenDao;

    @RequestMapping("/proov")
    String proov(String proov){
        return "Tere, "+proov;
    }
    
    @RequestMapping("/lisauusGeen")
    public String geenLaps(String nimetus, String alleel1Ema, String alleel2Ema, String alleel1Isa, String alleel2Isa){
        Alleel ema1 = new Alleel(nimetus, alleel1Ema.equals("true"));
        Alleel ema2 = new Alleel(nimetus, alleel2Ema.equals("true"));
        Geen emaGeen = new Geen(ema1, ema2);
        
        Alleel isa1 = new Alleel(nimetus, alleel1Isa.equals("true"));
        Alleel isa2 = new Alleel(nimetus, alleel2Isa.equals("true"));
        Geen isaGeen = new Geen(isa1, isa2);       
        
        GeenDB salvestan = new GeenDB();
        salvestan.nimetus = nimetus;
        salvestan.alleel1 = String.valueOf(emaGeen.juhuslikAlleel().positiivne);        
        salvestan.alleel2 = String.valueOf(isaGeen.juhuslikAlleel().positiivne);

        geenDao.save(salvestan);
        return "Geen salvestati" + salvestan.toString();
    } //http://localhost:36770/lisauusGeen?nimetus=reesus&alleel1Ema=true&alleel2Ema=true&alleel1Isa=true&alleel2Isa=true
    
    @RequestMapping("/otsiGeeni")
    public String otsiGeeni(String nimetus){
        StringBuilder strb = new StringBuilder();
        int i = 0;
        for(GeenDB geen: geenDao.findAll()){
            if(geen.nimetus.equals(nimetus)){
                strb.append(" <style> div{display: inline;} </style>").append(geen.id).append(". ").append("<div id='valiNimetus'>"+geen.nimetus+"</div>").append(": ").append("<div id='valiAlleel1"+i+"'>"+geen.alleel1+"</div>").append(", ").append("<div id='valiAlleel2"+i+"'>"+geen.alleel2+"</div>").append("<input type='checkbox' id='valitud"+i+"'/>");
                i++;
            }
        }
        strb.append("<br><br>Leitud geenid: <div id = 'leitud'>"+i+"</div>");
        return strb.toString();
    }
    
    @RequestMapping("/uus")
    public String uusGeen(){
        Geen emaGeen = new Geen(new Alleel("Reesus", true), new Alleel("Reesus", false));
        Geen isaGeen = new Geen(new Alleel("Reesus", true), new Alleel("Reesus", false));
        
        Geen lapseGeen = new Geen(emaGeen.juhuslikAlleel(), isaGeen.juhuslikAlleel());
        
        return "geen: "+lapseGeen+ " alleel1: "+emaGeen.juhuslikAlleel()+" alleel2: "+isaGeen.juhuslikAlleel();
    }
    
    @RequestMapping("/loetelu")
    public Iterable<GeenDB> loetelu(){
        return geenDao.findAll();
    }

    public static void main(String[] arg){
        SpringApplication.run(Rakendus.class, arg);
    }

}
//mvn package
//java -jar -Dserver.port=36770 target/baas1-1.jar
