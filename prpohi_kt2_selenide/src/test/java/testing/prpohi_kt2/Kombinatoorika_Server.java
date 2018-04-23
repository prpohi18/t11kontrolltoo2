package testing.prpohi_kt2;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Kombinatoorika_Server {
    
     // Testide jooksutamiseks nii nagu nad on, on vaja suunata greeny port 8080 kohalikku porti 80
     // sudo ssh lin2.tlu.ee -L 80:greeny.cs.tlu.ee:8080
     @Test
     public void Arvutus(){
         
         open("http://localhost/kombinatoorika.html");
         $("#input1").setValue("abcde");
         $("#input2").setValue("3");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("10"));
         
         $("#input1").setValue("casbvo");
         $("#input2").setValue("2");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("15"));
         

     }
     @Test
     public void Loendur(){
         open("http://localhost/korrad?number=abcde&moodustis=3");
         int loendur = (Integer.parseInt($("body").getText())) + 1;
         String textResult = loendur+"";
         open("http://localhost/kombinatoorika.html");
         $("#input1").setValue("abcde");
         $("#input2").setValue("3");
         $("#arvuta").click();
         sleep(600);
         $("#korrad").shouldHave(text(textResult));
     }
     
     @Test
     public void ArvutusVale(){
         open("http://localhost/kombinatoorika.html");
         $("#input1").setValue("abcde");
         $("#input2").setValue("6");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("Kontrolli andmeid"));
         
         $("#input1").setValue("");
         $("#input2").setValue("");
         $("#arvuta").click();
         $("#vastus").shouldHave(text("Kontrolli andmeid"));
     }


}
