import org.junit.*;
import static org.junit.Assert.*;


public class FunctionTest{
  @Test
 public void kaugusPixel()throws Exception{

   assertEquals(68.0, Andmed.pixelcalc(85, 20, 130, 110), 0.1);
  }
}
