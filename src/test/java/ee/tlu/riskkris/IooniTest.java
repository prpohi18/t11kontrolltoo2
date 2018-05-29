package ee.tlu.riskkris;
import ee.tlu.riskkris.ioonid.Ioon;
import org.junit.Test;
import static org.junit.Assert.*;
public class IooniTest {
    public IooniTest() {
    }
    @Test
    public void loomine(){
        Ioon i1 = new Ioon("H+", 1, 1);
        Ioon i2 = new Ioon ("NO3-", 3, -1);
        
        assertEquals(1, i1.kysiLaeng());
        assertEquals(3, i2.kysiAatommass());
    }
    
}