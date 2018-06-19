package testid;

import akordid.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TahtedeTest {

	@Test
	public void test() {
		Kolmkola k=new Kolmkola("D");
		assertEquals(69, k.kvint());
		assertEquals("D F# A", k.tekstina());
	}
}