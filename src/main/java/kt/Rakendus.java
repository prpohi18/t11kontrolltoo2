package kt;

import java.lang.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class Rakendus {
	
	@Autowired
    private GeeniBaasDAO GeeniBaasDao;
	
	@RequestMapping("/lisa")
    public String lisa(String nimetus, boolean emaalleel1, boolean emaalleel2, boolean isaalleel1, boolean isaalleel2){
		Alleel ema1 = new Alleel(nimetus, emaalleel1);
		Alleel ema2 = new Alleel(nimetus, emaalleel2);
		Geen salvestaema = new Geen(ema1, ema2);

		Alleel isa1 = new Alleel(nimetus, isaalleel1);
		Alleel isa2 = new Alleel(nimetus, isaalleel2);
		Geen salvestaisa = new Geen(isa1, isa2);

		GeeniBaas salvesta = new GeeniBaas();
		salvesta.nimetus = nimetus;
		salvesta.esimenev22rtus = (salvestaema.juhuslikAlleel().v22rtus);
		salvesta.teinev22rtus = (salvestaisa.juhuslikAlleel().v22rtus);
        GeeniBaasDao.save(salvesta);
		return "salvestatud";
    }
	/*
	@RequestMapping("/otsi")
	public String otsiGeeni(String nimetus){
        GeeniString gs = new GeeniString();
        int i = 0;
        for (GeeniBaas geen : GeeniBaasDao.findAll()) {
            if (geen.nimetus.equals(nimetus)) {
                gs.
                    append("<tr>").
                    append("<td>"+gene.id+"</td>").
                    append("<td class=\"nimetus\">"+geen.nimetus+"</td>").
                    append("<td class=\"esimenev22rtus\">"+geen.esimenev22rtus+"</td>").
                    append("<td class=\"teinev22rtus\">"+geen.teinev22rtus+"</td>").
                    append("<td><input type=\"checkbox\"/></td>").
                    append("</tr>");
                i++;
            }
        }
        return gs.toString();

	}*/
	
	public static void main(String[] args){
		Alleel a5 = new Alleel("reesus", true);
		Alleel a6 = new Alleel("reesus", false);
		Alleel a7 = new Alleel("muu", true);
		Alleel a8 = new Alleel("muu", false);
		Geen g5 = new Geen(a5, a6);
		Geen g6 = new Geen(a7, a8);
	}
}