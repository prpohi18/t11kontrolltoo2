package testid;

import akordid.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class KolmkoladeTest {

	@Test
	public void KolmkolaTest() {
		Kolmkola k=new Kolmkola(45);
		assertEquals(45, k.toonika());
		assertEquals(49, k.terts());
		assertEquals(52, k.kvint());
	}
	@Test
	public void C(){
		Kolmkola k=new CKolmkola();
		assertEquals(60, k.toonika());
		assertEquals(64, k.terts());
		assertEquals(67, k.kvint());
	}
	@Test
	public void F(){
		Kolmkola k=new FKolmkola();
		assertEquals(65, k.toonika());
		assertEquals(69, k.terts());
		assertEquals(72, k.kvint());
	}
	@Test
	public void G(){
		Kolmkola k=new GKolmkola();
		assertEquals(67, k.toonika());
		assertEquals(71, k.terts());
		assertEquals(74, k.kvint());
	}

}