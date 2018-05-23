import org.junit.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class testid {
    @Test
    public void AndmeteLisaTest(){
        open("http://localhost:21213/kt2.html");
        $("#nimetus").setValue("test");
        $("#valgud").setValue("1");
        $("#rasvad").setValue("3");
        $("#susivesikud").setValue("0.5");
        $("#addBtn").click();
        System.out.println($("#andmed").getText());
    }

    @Test
    public void AndmeteVaadeTest() {
        $("#nimetus3").setValue("test");
        $("#viewBtn").click();
        System.out.println($("#andmed").getText());
    }

    @Test
    public void AndmeteKustutamineTest(){
        $("#nimetus2").setValue("test");
        $("#delBtn").click();
        System.out.println($("#andmed").getText());
    }

    @Test
    public void AndmeteOtsimineTest(){
        $("#alates").setValue("0");
        $("#kuni").setValue("4");
        $("#searchBtn").click();
        System.out.println($("#andmed").getText());
    }


}
