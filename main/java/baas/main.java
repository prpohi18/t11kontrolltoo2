package baas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigInteger;

@RestController
@SpringBootApplication

public class main{
    @Autowired
    private kombinatoorikaDAO kombinatoorikaDao;
	
    public static BigInteger factorial(BigInteger number) {
		BigInteger result = BigInteger.valueOf(1);

		for (long factor = 2; factor <= number.longValue(); factor++) {
			result = result.multiply(BigInteger.valueOf(factor));
		}

		return result;
}
	
    public void addNew(int n, int m, int result){
        kombinatoorika k = new kombinatoorika();
        k.numn = n;
        k.numm = m;
        k.result = result;
		k.times = 1;
        kombinatoorikaDao.save(k);
    }
	
	public BigInteger kombinatoorikaf(int n, int m){
		int c = n-m;
		return (factorial(BigInteger.valueOf(n)).divide((factorial(BigInteger.valueOf(m)).multiply(factorial(BigInteger.valueOf(c))))));
    }

	@RequestMapping("/check")
    public String check(int n, int m){	
		kombinatoorika k = kombinatoorikaDao.findExistingOne(n, m);
		int result;
		if(k==null) {
			if(n >= m && n != 0 && m != 0) {
				result = kombinatoorikaf(n, m).intValue();
				addNew(n, m, result);
				return result+" (1)";
			} else {
				return "Valed andmed";
			}
		}
		else {
			k.times += 1;
			kombinatoorikaDao.save(k);
			return k.result+" ("+k.times+")";
		}
    }

    public static void main(String[] arg){
        SpringApplication.run(main.class, arg);
    }
}


//mvn package
//java -jar -Dserver.port=43256 target/baas1-1.jar
//http://greeny.cs.tlu.ee:43256/tervitus?eesnimi=Juku
