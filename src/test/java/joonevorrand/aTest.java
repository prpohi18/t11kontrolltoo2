package joonevorrand;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class aTest{

	/*1. ülesanne punktid sirgel y=3x, ainult kordajaga*/
    @Test
    public void kontroll(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		double y1 = x1.yLeidmine(2.0);
		double y2 = x1.yLeidmine(-2.0);
		double y3 = x1.yLeidmine(10.5);
		double y4 = x1.yLeidmine(-0.5);
        assertEquals(6.0f, y1, 0.0001);
		assertEquals(-6.0f, y2, 0.0001);
		assertEquals(31.5f, y3, 0.0001);
		assertEquals(-1.5f, y4, 0.0001);
    }
	/*2.ülesanne punktid sirgel y=3x, kordajaga ja vabaliikmega*/
	@Test
	public void esimeneValem(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=0;
		double y1 = x1.yLeidmine(2.0);
		double y2 = x1.yLeidmine(-2.0);
		double y3 = x1.yLeidmine(10.5);
		double y4 = x1.yLeidmine(-0.5);
        assertEquals(6.0f, y1, 0.0001);
		assertEquals(-6.0f, y2, 0.0001);
		assertEquals(31.5f, y3, 0.0001);
		assertEquals(-1.5f, y4, 0.0001);
		
	}
	/*2.ülesanne punktid sirgel y=3x+2, kordajaga ja vabaliikmega*/
	@Test
	public void teineValem(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=2;
		double y1 = x1.yLeidmine(2.0);
		double y2 = x1.yLeidmine(-2.0);
		double y3 = x1.yLeidmine(10.5);
		double y4 = x1.yLeidmine(-0.5);
        assertEquals(8.0f, y1, 0.0001);
		assertEquals(-4.0f, y2, 0.0001);
		assertEquals(33.5f, y3, 0.0001);
		assertEquals(0.5f, y4, 0.0001);
		
	}
	/*2.ülesanne parameetriteks on x-ide masiiv, tagastuseks on y-ite massiiv */
	@Test
	public void massiiv(){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=2;
		/*x-ide massiiv*/
		double[] xMassiiv = new double[] {2.0, -2.0, 10.5, -0.5};
		/*y-ite massiiv, oodatud vastused*/
		double[] yMassiiv = new double[] {8.0, -4.0, 33.5, 0.5};
		/*y-ite vastused peale arvutamise massiivi*/
		double[] y1 = x1.yLeidmineMassiiv(xMassiiv);
		assertEquals(yMassiiv[0], y1[0], 0.0001);
		assertEquals(yMassiiv[1], y1[1], 0.0001);
		assertEquals(yMassiiv[2], y1[2], 0.0001);
		assertEquals(yMassiiv[3], y1[3], 0.0001);
		
	}

	
}