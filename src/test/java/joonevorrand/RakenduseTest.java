package joonevorrand;
import org.junit.*;
import static org.junit.Assert.*;

public class RakenduseTest {
    
    @Test
    public void testKordajaga() {
        //kordaja on 3
        assertEquals(3, Arvutamine.arvutaKordajaga(3, 1), 0.001);
        assertEquals(369, Arvutamine.arvutaKordajaga(3, 123), 0.001);
        assertEquals(4011, Arvutamine.arvutaKordajaga(3, 1337), 0.001);
        assertEquals(1.5, Arvutamine.arvutaKordajaga(3, 0.5), 0.001);
        assertEquals(12.75, Arvutamine.arvutaKordajaga(3, 4.25), 0.001);
    }
    
    @Test
    public void testEtteantudKordajaga() {
        //kordaja on kasutaja antud
        assertEquals(3, Arvutamine.arvutaKordajaga(3, 1), 0.001);
        assertEquals(5, Arvutamine.arvutaKordajaga(1, 5), 0.001);
        assertEquals(81, Arvutamine.arvutaKordajaga(9, 9), 0.001);
        assertEquals(9.45, Arvutamine.arvutaKordajaga(3, 3.15), 0.001);
        assertEquals(10.5, Arvutamine.arvutaKordajaga(2, 5.25), 0.001);
    }
    
    @Test
    public void testVabaliikmega() {
        //võrrand on y=3x (vabaliige on 0)
        assertEquals(15, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 5, 0), 0.001);
        assertEquals(4.5, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 1.5, 0), 0.001);
        assertEquals(21, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 7, 0), 0.001);
        assertEquals(27, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 9, 0), 0.001);
        assertEquals(3, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 1, 0), 0.001);
    }
    
    @Test
    public void testEtteantudVabaliikmega() {
        //võrrand on y=3x+2
        assertEquals(17, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 5, 2), 0.001);
        assertEquals(6.5, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 1.5, 2), 0.001);
        assertEquals(23, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 7, 2), 0.001);
        assertEquals(29, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 9, 2), 0.001);
        assertEquals(5, ArvutamineVabaliikmega.arvutaVabaliikmega(3, 1, 2), 0.001);
    }
    
    @Test
    public void testMassiiviga() {
        //ette antakse massiiv x-idega
        
        double[] x1 = {5, 7, 8};
        double[] expectedResult1 = {15, 21, 24};
        double[] y1 = ArvutamineMassiiviga.arvutaMassiiviga(3, x1, 0);
        for (int i = 0; i < x1.length; i++) {
            assertEquals(expectedResult1[i], y1[i], 0.001);
        }
        
        double[] x2 = {1.1, 1.2, 1.3};
        double[] expectedResult2 = {3.3, 3.6, 3.9};
        double[] y2 = ArvutamineMassiiviga.arvutaMassiiviga(3, x2, 0);
        for (int i = 0; i < x2.length; i++) {
            assertEquals(expectedResult2[i], y2[i], 0.001);
        }
        
        double[] x3 = {12, 64, 234};
        double[] expectedResult3 = {31, 135, 475};
        double[] y3 = ArvutamineMassiiviga.arvutaMassiiviga(2, x3, 7);
        for (int i = 0; i < x1.length; i++) {
            assertEquals(expectedResult3[i], y3[i], 0.001);
        }
        
        double[] x4 = {5.8, 2.4, 4.7};
        double[] expectedResult4 = {32, 15, 26.5};
        double[] y4 = ArvutamineMassiiviga.arvutaMassiiviga(5, x4, 3);
        for (int i = 0; i < x4.length; i++) {
            assertEquals(expectedResult4[i], y4[i], 0.001);
        }
    }
}