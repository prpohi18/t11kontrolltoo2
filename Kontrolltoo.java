import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Kontrolltoo {
    public static void main (String[] args) {
        
        String kordaja;
        String x;
        String vabaliige;
        String expected;
        
        System.out.println("[Test start]");
        open("http://greeny.cs.tlu.ee:40404/");
        
        kordaja = "1.5";
        x = "2";
        vabaliige = "0";
        expected = "Y-koordinaat: 3.0";
        test(kordaja, x, vabaliige, expected);
        
        kordaja = "10";
        x = "5";
        vabaliige = "5";
        expected = "Y-koordinaat: 55.0";
        test(kordaja, x, vabaliige, expected);
        
        kordaja = "500";
        x = "3";
        vabaliige = "-1700";
        expected = "Y-koordinaat: -200.0";
        test(kordaja, x, vabaliige, expected);
        
        kordaja = "40";
        x = "6";
        vabaliige = "8";
        expected = "Y-koordinaat: 248.0";
        test(kordaja, x, vabaliige, expected);
        
        kordaja = "5";
        x = "1.5";
        vabaliige = "2.5";
        expected = "Y-koordinaat: 10.0";
        test(kordaja, x, vabaliige, expected);
        
        System.out.println("[Test end]");
    }
    
    public static void test(String kordaja, String x, String vabaliige, String expected) {
        $("#kordajaKast").setValue(kordaja);
        $("#xKast").setValue(x);
        $("#vabaliikmeKast").setValue(vabaliige);
        $("#arvutamine").click();
        System.out.println(">> " + kordaja + "*" + x + "+" + vabaliige);
        if (expected.equals($("#vastus").getText())) {
            System.out.println(">> SUCCESS!");
        } else {
            System.out.println(">> FAIL!");
            System.out.println(">> RESULT: " + $("#vastus").getText() + ", EXPEXTED:" + expected);
        }
    }
}