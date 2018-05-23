package kt;

import org.junit.*;
import static org.junit.Assert.*;

public class MyTest {
	@Test
	public void alleeliLoomine(){
		Alleel a1=new Alleel("reesus", true);
		assertEquals("reesus", a1.nimetus);
		assertEquals(true , a1.v22rtus);
	}
	@Test
	public void geeniLoomine1(){
		Alleel a1=new Alleel("reesus", false);
		Alleel a2=new Alleel("reesus", false);
		Geen g1=new Geen(a1, a2);
		assertEquals(false, g1.kontroll());
		
		Alleel a3=new Alleel("midagimuud", true);
		Geen g2=new Geen(a1, a3);
		assertEquals(false, g1.kontroll());
	}
	@Test
	public void geeniLoomine2(){
		Alleel a1=new Alleel("reesus", false);
		Alleel a2=new Alleel("reesus", true);
		Geen g1=new Geen(a1, a2);
		assertEquals(true, g1.kontroll());
	}
}