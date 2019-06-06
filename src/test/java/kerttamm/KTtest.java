package kerttamm;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KTtest {

	@Test
	public void getLetter() {
            Sona sona = new Sona("pere");
            assertEquals(0, sona.saaTahtedeArv('a'));
            assertEquals(1, sona.saaTahtedeArv('p'));
            assertEquals(2, sona.saaTahtedeArv('e'));
        }
        
        @Test
	public void getLetterCountFromSentence() {
            
            Lause lause = new Lause("tere tali!");
            assertEquals(1, lause.saaTahtedeArv('a'));
            assertEquals(0, lause.saaTahtedeArv('p'));
            assertEquals(2, lause.saaTahtedeArv('e'));
	}
        
        @Test
	public void getWordCountFromSentence(){
            Lause lause = new Lause("tore lause");
            assertEquals(2, lause.getWordCount());
	}
        
	@Test
	public void getWordsArray(){
            Lause lause = new Lause("lause kontroll");
            Sona[] expected = new Sona[]{new Sona("lause"),new Sona("kontroll")};
            Sona[] actual = lause.saaSonadeMassiiv();
            assertEquals("lause",actual[0].getWord());
            assertEquals("kontroll",actual[1].getWord());
            
            assertEquals(2, actual.length);
	}
        
        @Test
        public void webTest(){
            open("http://localhost:8080/veebileht.html");
              
            $("#lause").setValue("Mulle maitsevad maasikad");
            $("#finda").click();
            $("#vastus").shouldHave(text("selles lauses on 5 a tähte ja sõnas 'Mulle' on 0 a tähte, sõnas 'maitsevad' on 2 a tähte, sõnas 'maasikad' on 3 a tähte, ja andmebaasis olemas olevad sõnad on: Mulle, maitsevad, maasikad, uued sõnad on"));
        }
}
