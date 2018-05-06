package tahed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication
public class KT_Rakendus {

	@RequestMapping("/lause")
	public String uusTekst(String tekst){
	 String sonad = "";
	 Lause l = new Lause();
	 l.lisaMassiivi(tekst);
	 TaheOtsingSonast[] m = l.kysiSonad();

	 for(int i=0; i<m.length; i++){
		sonad += "("+m[i].loeTahti('a')+")"+m[i].kysiSona()+"<br>";
		}
	 return "Sisestatud lause: "+l.kysiLause()+"<br>"+" 'A' tähti selles lauses: "+l.loeTahti('a')+"<br>"+"Sõnade arv lauses: "+l.mituSona()+"<br>"+"'A' tähti igas sõnas: <br>"+sonad;
	 }

	public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
		SpringApplication.run(KT_Rakendus.class);
	}
}
//java -jar -Dserver.port=40305 target/tahed-1.jar