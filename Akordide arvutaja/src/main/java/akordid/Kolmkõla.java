package akordid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@SpringBootApplication
public class Kolmkõla{
    @Autowired
    
    @RequestMapping("/tervitus")
    String tervita(String eesnimi){
        return "Tere, "+eesnimi;
    }
    @RequestMapping("/proov")
    public String lisa(String email, int synniaasta){
        Jooksja isik=new Jooksja();
        isik.email=email;
        isik.synniaasta=synniaasta;
        isik.voistlustearv=1;
        jooksjaDao.save(isik);
        return email+" salvestatud";
    }
	@RequestMapping("/proov1")
    public String Kolmkola(int y){
		int põhitoon;
		y=põhitoon;
		
	public String Kolmkola(String nimetus){
		this(MuusikaAbi.leiaKõrgus(nimetus));
		}
	public	int toonika(){
		return y;
		}
	public	int terts(){
		return y + 4;
		}
	public	int kvint(){
		return y + 7;
		}
		return y+" "+terts()+" "+kvint();
		
		return MuusikaAbi.leiaTäht(y)+" "+MuusikaAbi.leiaTäht(terts())+ " "+MuusikaAbi.leiaTäht(kvint());
		   }
}

//java -jar -Dserver.port=42534 target/baas1-1.jar