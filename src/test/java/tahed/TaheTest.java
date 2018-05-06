package tahed;
import org.junit.*;
import static org.junit.Assert.*;
public class TaheTest{
	TaheOtsingSonast y=new TaheOtsingSonast("pere");
	
	@Test
	public void SonaTahtedeks(){
		
		assertEquals(0, y.loeTahti('a'));
		assertEquals("pere", y.kysiSona());
		assertEquals('a', y.kysiTaht());
		
		assertEquals(1, y.loeTahti('p'));
		assertEquals('p', y.kysiTaht());
		
		assertEquals(2, y.loeTahti('e'));
		assertEquals('e', y.kysiTaht());
		
	}
}