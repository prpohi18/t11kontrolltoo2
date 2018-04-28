package tests.t11kontrolltoo;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Kombinatoorika {
    
     @Test
     public void ShouldSucceed(){
         open("http://www.tlu.ee/~rasmuskk/kt2js/index.html");
         $("#number").setValue("abcd");
         $("#moodustis").setValue("2");
         $("#calc").click();
         $("#ans").shouldHave(text("6"));
         
         $("#number").setValue("abcdef");
         $("#moodustis").setValue("3");
         $("#calc").click();
         $("#ans").shouldHave(text("20"));
         

     }
     
     @Test
     public void ShouldFail(){
         open("http://www.tlu.ee/~rasmuskk/kt2js/index.html");
         $("#number").setValue("abcdefg");
         $("#moodustis").setValue("8");
         $("#calc").click();
         $("#ans").shouldHave(text("Antud andmetes on midagi valesti"));
         
         $("#number").setValue("");
         $("#moodustis").setValue("");
         $("#calc").click();
         $("#ans").shouldHave(text("Antud andmetes on midagi valesti"));
     }

     @Test
     public void ShouldSucceed2(){
         open("http://greeny.cs.tlu.ee:9123/kombinatoorika.html");
         $("#number").setValue("abcd");
         $("#moodustis").setValue("2");
         $("#calc").click();
         $("#ans").shouldHave(text("6"));
         int counter = (Integer.parseInt($("counter").getText())) + 1;
         String counterString = counter + "";
         $("#number").setValue("abcd");
         $("#moodustis").setValue("2");
         $("#calc").click();
         $("#counter").shouldHave(text(counterString));
     }


}
