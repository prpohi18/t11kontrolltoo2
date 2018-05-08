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
    private GeenDAO GeenDao;
    
   /* @RequestMapping("/joed")
    public String lisa(String nimi, int korter, double kommunaalid, String tasumine){
        Jogi isik=new Jogi();
        isik.nimi = nimi;
        isik.korter = korter;
        isik.kommunaalid = kommunaalid;
        isik.tasumine = tasumine;
        elanikDao.save(isik);
        return nimi +" salvestatud";

    }*/

    /*@RequestMapping("/kustuta")
    public String kustuta(String nimi){
        Elanik isik=elanikDao.findOne(nimi);
        if(isik==null){return nimi+"puudub";}
		elanikDao.delete(isik);
		return nimi+" kustutatud";
    }
    
    @RequestMapping("/loetelu")
    public Iterable<Jogi> loetelu(){
        return jogiDao.findAll();
    }
    
	@RequestMapping("kaugusmereni")
	public double kaugusMereni(String joenimi, double kaugussuudmest){
		Jogi j=jogiDao.findOne(joenimi);
		if(j==null){return -1;}
		return j.kaugusMereni(kaugussuudmest);
	}
    //http://greeny.cs.tlu.ee:36770/kaugusmereni?joenimi=Kirivalla%20oja&kaugussuudmest=10
    //java -jar -Dserver.port=36770 target/baas1-1.jar
	
    public static void main(String[] arg){
        SpringApplication.run(Rakendus.class, arg);
    }

}*/