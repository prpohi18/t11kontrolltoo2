package ttaevik.tlu.kt;


import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KtApplicationTests {

	@Test
	public void getLetter() {
            
            Word sona = new Word("pere");
            assertEquals(0, sona.getLetterCount('a'));
            assertEquals(1, sona.getLetterCount('p'));
            assertEquals(2, sona.getLetterCount('e'));
        }
        
        @Test
	public void getLetterCountFromSentence() {
            
            Sentence lause = new Sentence("tere tali!");
            assertEquals(1, lause.getLetterCount('a'));
            assertEquals(0, lause.getLetterCount('p'));
            assertEquals(2, lause.getLetterCount('e'));
        }
        
        @Test
	public void getWordCountFromSentence(){
            Sentence lause = new Sentence("tore lause");
            assertEquals(2, lause.getWordCount());
            
        }
        
        @Test
	public void getWordsArray(){
            Sentence lause = new Sentence("lause kontroll");
            Word[] expected = new Word[]{new Word("lause"),new Word("kontroll")};
            Word[] actual = lause.getWordsArray();
            assertEquals("lause",actual[0].getWord());
            assertEquals("kontroll",actual[1].getWord());
            
            assertEquals(2, actual.length);
                        
        }
        
        @Test
        public void webTest(){
            open("http://localhost:8080/webform.html");
              
            $("#lause").setValue("tere minu nimi on tauri");
            $("#finda").click();
            $("#vastus").shouldHave(text("selles lauses on 1 a tähte ja sõnas 'tere' on 0 a tähte, sõnas 'minu' on 0 a tähte, sõnas 'nimi' on 0 a tähte, sõnas 'on' on 0 a tähte, sõnas 'tauri' on 1 a tähte,"));
        }
}
