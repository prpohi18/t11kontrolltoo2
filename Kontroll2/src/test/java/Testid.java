import ee.tlu.taavim.kontroll2.Aine;
import ee.tlu.taavim.kontroll2.Ioon;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testid {
    
    public Testid() {
    }
    
    @Test
    public void looIoon(){
        Ioon i1 = new Ioon("H", 1.0, 1);
        Ioon i2 = new Ioon("NO3", 3.0, -1);
        
        assertEquals(1, i1.kysiLaeng());
        assertEquals(3.0, i2.kysiAatomMassideSumma(), 0.1);
    }
    
    @Test
    public void aineLoomineOnnestus(){
        Ioon i1 = new Ioon("Na", 1.0, 1);
        Ioon i2 = new Ioon("Cl", 3.0, -1);
        Aine a1 = new Aine(i1, i2);
        
        assertEquals(4.0, a1.kysiMolekulMass(), 0.1);
        assertEquals("NaCl", a1.kysiNimetus());
    }
    @Test
    public void aineLoomineEbaonnestus(){
        Ioon i1 = new Ioon("Ca", 1.0, 2);
        Ioon i2 = new Ioon("Cl", 3.0, -1);
        Aine a1 = new Aine(i1, i2);;
        System.out.println(a1.kysiNimetus());
        assertEquals(0.0, a1.kysiMolekulMass(), 0.1);
        assertNull(a1.kysiNimetus());
    }
}
