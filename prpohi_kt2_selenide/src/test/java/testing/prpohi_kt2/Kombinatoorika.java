package testing.prpohi_kt2;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Kombinatoorika {
    
     @Test
     public void Arvutus(){
         open("http://www.tlu.ee/~timj/prpohi_kt2/index.html");
         $("#number").setValue("abcde");
         $("#moodustis").setValue("3");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("10"));
         
         $("#number").setValue("casbvo");
         $("#moodustis").setValue("2");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("15"));
         

     }
     
     @Test
     public void ArvutusVale(){
         open("http://www.tlu.ee/~timj/prpohi_kt2/index.html");
         $("#number").setValue("abcde");
         $("#moodustis").setValue("6");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("Kontrolli andmeid"));
         
         $("#number").setValue("");
         $("#moodustis").setValue("");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("Kontrolli andmeid"));
     }


}
