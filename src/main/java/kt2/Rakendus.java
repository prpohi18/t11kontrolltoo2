package kt2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static kt2.Main.funktsioon;

@RestController
@SpringBootApplication
public class Rakendus{

  @RequestMapping("/tervitus")
  String tervita(String eesnimi){
      return "Tere, "+eesnimi;
  }

  @RequestMapping("/arvuta/{a}/{b}/{x1}/{x2}")
  public String arvuta(@PathVariable String a, @PathVariable String b, @PathVariable String x1, @PathVariable String x2) {
    //a=kordaja, b=vabaliige, x1=vähim x-i väärtus, x2=suurim x-i väärtus

    Kordaja k1 = new Kordaja(Integer.parseInt(a));
    Vabaliige v1 = new Vabaliige(Integer.parseInt(a), 0);
    String y = "Võrrandi vastused y = ";
    int c = Integer.parseInt(x2)-Integer.parseInt(x1)+1;
    int[]x = new int[c];

    for (int i = 0; i < c; i++) {
      x[i] = Integer.parseInt(x1);
      x1 += 1;
    }
    if (Integer.parseInt(b)==0) {
      y = Arrays.toString(funktsioon(x, k1));
    } else {
      v1.vabaliige = Integer.parseInt(b);
      y = Arrays.toString(funktsioon(x, v1));
    }
    return String.valueOf(y);
  }

public static void main(String[] arg){
    SpringApplication.run(Rakendus.class, arg);
  }
}

