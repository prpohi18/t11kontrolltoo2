package kt2;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class Testid{
  @Autowired
    private TestRestTemplate restTemplate;

  @Test
  public void y3x(){
    Vorrand x1=new Vorrand(12);
    Vorrand x2=new Vorrand(15);
    assertEquals(12, x1.joon(4));
    assertEquals(15, x2.joon(5));
  }

  @Test
  public void y3x_kordaja(){
    Kordaja k1=new Kordaja(2);
    Kordaja k2=new Kordaja(7);
    assertEquals(6, k1.joon(3));
    assertEquals(28, k2.joon(4));
  }


  @Test
  public void vabaliige_kordaja(){
    Vabaliige v1= new Vabaliige(2, 5); //y=2x+5
    Vabaliige v2= new Vabaliige(3, 0); //y=3x
    Vabaliige v3= new Vabaliige(3, 2); //y=3x+2
    assertEquals(9, v1.joon(2));
    assertEquals(15, v2.joon(5));
    assertEquals(5, v3.joon(1));
  }

  @Test 
  public void rakendusArvuta1(){  
    assertEquals("y = [4, 6]",
      this.restTemplate.getForObject("/arvuta?a=2&b=0&x1=2&x2=3", String.class));
  } //nulliga 

  @Test 
  public void rakendusArvuta2(){  
    assertEquals("y = [5, 7, 9]",
      this.restTemplate.getForObject("/arvuta?a=2&b=1&x1=2&x2=4", String.class));
  }
}