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
/* Veebitest.java käivitatud NetBeansis ja tulemus oli positiivne.

kood:

package tahed;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;

public class Veebitest {
    public static void main(String[] args){ 
        open("http://greeny.cs.tlu.ee:40305/tahed.html");
        $("#kast").setValue("kaalikas ja kapsas on juurviljad");
        $("#nupp").click();
        System.out.println($("#vastus").getText());
    }
}

Tulemus:

Sisestatud lause: kaalikas ja kapsas on juurviljad
'A' tähti selles lauses: 7
Sõnade arv lauses: 5
'A' tähti igas sõnas:
(3)kaalikas
(1)ja
(2)kapsas
(0)on
(1)juurviljad*/