package kt2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

  @RequestMapping("/arvuta")
  public String arvuta(int a, int b, int x1, int x2) {
    //a=kordaja, b=vabaliige, x1=vähim x-i väärtus, x2=suurim x-i väärtus

    Kordaja k1 = new Kordaja(a);
    Vabaliige v1 = new Vabaliige(a, 0);
    String y = "Võrrandi vastused y = ";
    int c = x2-x1+1;
    int[]x = new int[c];

    for (int i = 0; i < c; i++) {
      x[i] = x1;
      x1 += 1;
    }
    if (b==0) {
      y = y + Arrays.toString(funktsioon(x, k1));
    } else {
      v1.vabaliige = b;
      y = y + Arrays.toString(funktsioon(x, v1));
    }
    return y;
  }

public static void main(String[] arg){
    SpringApplication.run(Rakendus.class, arg);
  }
}

