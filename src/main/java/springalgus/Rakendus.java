package springalgus;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
     @Autowired 
     private HttpSession httpSession;
    //List<IonModel> dataArray = new ArrayList<IonModel>();
    
    List<IonModel> getData(){
       if(httpSession.getAttribute("hoidla")==null){
          httpSession.setAttribute("hoidla", new ArrayList<IonModel>());
       }
       return (List<IonModel>)httpSession.getAttribute("hoidla");
    }
     
    @RequestMapping("/ion")
    String ionAdd(String nimetus, Double mass, int laeng){
        IonModel ion = new IonModel();
        ion.setData(nimetus, mass, laeng);
        this.getData().add(ion);
        
        return "tehtud";
    }
    @RequestMapping("/ionlist")
    public List<String> ionList(){
        List<String> result = new ArrayList();
        for(int i = 0; i<this.getData().size(); i++){
            result.add(this.getData().get(i).getNimetus());
        }
        return result;
    }
    @RequestMapping("/aine")
    public String aine(){
        AineFromArray afa = new AineFromArray();
        afa.createAine(this.getData());
        return afa.getNimetus()+" Mass:"+String.valueOf(afa.getMass());
    }
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
        IonModel test = new IonModel();
        IonModel test2 = new IonModel();
        IonModel test3 = new IonModel();
        test.setData("H+", 1.008, 1);
        System.out.println(test.getNimetus()+" laeng:"+test.getLaeng()+" mass: "+test.getMass());
        test.setData("NO3-", 62.01, -1);
        System.out.println(test.getNimetus()+" laeng:"+test.getLaeng()+" mass: "+test.getMass());
        List<IonModel> arrayTest = new ArrayList<IonModel>();
        
        test.setData("Ca", 80.16, 2);
        arrayTest.add(test);
        test2.setData("Cl", 35.45, -1);
        arrayTest.add(test2);
        test3.setData("Cl", 35.45, -1);
        arrayTest.add(test3);
        System.out.println(arrayTest);
        AineFromArray afa = new AineFromArray();
        afa.createAine(arrayTest);
        
        System.out.println(afa.getNimetus());
        System.out.println(afa.getMass());
        
    }
}
