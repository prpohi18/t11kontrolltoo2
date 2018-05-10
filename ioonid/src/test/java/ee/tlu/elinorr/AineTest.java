package ee.tlu.elinorr;
import ee.tlu.elinorr.ioonid.Aine;
import ee.tlu.elinorr.ioonid.Ioon;
import org.junit.Test;
import static org.junit.Assert.*;
public class AineTest {
    public AineTest() {
    }
    @Test
    public void aineLoodi(){
        Ioon i1 = new Ioon("Na", 23, 1);
        Ioon i2 = new Ioon("Cl", 35, -1);
        Aine a1 = new Aine(i1, i2);
        System.out.println(a1.kysiNimetus());
        assertEquals(58, a1.kysiMolekulmass());
        assertEquals("NaCl", a1.kysiNimetus());
    }
    @Test
    public void aineLoodi2(){
        Ioon i1 = new Ioon("Ca", 40, 2);
        Ioon i2 = new Ioon("O", 16, -2);
        Aine a1 = new Aine(i1, i2);
        System.out.println(a1.kysiNimetus());
        assertEquals(56, a1.kysiMolekulmass());
        assertEquals("CaO", a1.kysiNimetus());
    }
    @Test
    public void aineEiLoodud(){
        Ioon i1 = new Ioon("Ca", 40, 2);
        Ioon i2 = new Ioon("Cl", 35, -1);
        Aine a1 = new Aine(i1, i2);;
        System.out.println(a1.kysiNimetus());
        assertEquals(0, a1.kysiMolekulmass());
        assertNull(a1.kysiNimetus());
    }
}
