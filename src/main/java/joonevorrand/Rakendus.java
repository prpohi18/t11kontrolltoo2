package joonevorrand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;

@RestController
@SpringBootApplication
public class Rakendus{
    
    @RequestMapping("/tervitus")
    String tervita(String eesnimi){
        return "Tere, "+eesnimi;
    }
 	
	@RequestMapping("/arvuta/{a}/{b}/{xMin}/{xMax}")
	public String lisa(@PathVariable String a, @PathVariable String b, @PathVariable String xMin, @PathVariable String xMax){
		Joon x1 = new Joon();
		x1.kordaja=Double.parseDouble(a);
		//x1.vabaliige=Double.parseDouble(b);
		int c = Integer.parseInt(xMax)-Integer.parseInt(xMin)+1;
		double[] x = new double[c];
		double[] y1;
		for (int i = 0; i < c; i++) {
		  x[i] = Double.parseDouble(xMin)+i;
		}
		if (Double.parseDouble(b)==0.0) {
			x1.vabaliige = 0.0;
			y1 = x1.yLeidmineMassiiv(x);
		} else {
			x1.vabaliige = Double.parseDouble(b);
			y1 = x1.yLeidmineMassiiv(x);
		}
		
		return Arrays.toString(y1);
	}
	
    public static void main(String[] arg){
        SpringApplication.run(Rakendus.class, arg);
    }    
}

/*java -jar -Dserver.port=51530 target/baas1-1.jar
*/