package joonevorrand;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
    @Test
    public void yKoord(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		double y1 = x1.leiaY(1.0);
		double y2 = x1.leiaY(0.0);
		double y3 = x1.leiaY(-1.0);
        assertEquals(3.0f, y1, 0.0001);
		assertEquals(0.0f, y2, 0.0001);
		assertEquals(-3.0f, y3, 0.0001);
    }
	@Test
	public void esimeneValem(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=0;
		double y1 = x1.leiaY(1.0);
		double y2 = x1.leiaY(0.0);
		double y3 = x1.leiaY(-1.0);
		assertEquals(3.0f, y1, 0.0001);
		assertEquals(0.0f, y2, 0.0001);
		assertEquals(-3.0f, y3, 0.0001);
		
	}
	@Test
	public void teineValem(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=2;
		double y1 = x1.leiaY(1.0);
		double y2 = x1.leiaY(0.0);
		double y3 = x1.leiaY(-1.0);
		assertEquals(5.0f, y1, 0.0001);
		assertEquals(2.0f, y2, 0.0001);
		assertEquals(-1.0f, y3, 0.0001);
		
	}
	@Test
	public void massiiv(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=2;
		double[] massiiv = new double[] {1.0, 0.0, -1.0};
		double[] ymassiiv = new double[] {5.0, 2.0, -1.0};
	
		double[] y1 = x1.leiaYMassiiv(massiiv);
		assertEquals( ymassiiv[0], y1[0], 0.0001);
		assertEquals( ymassiiv[1], y1[1], 0.0001);
		assertEquals( ymassiiv[2], y1[2], 0.0001);
		
		
	}
}