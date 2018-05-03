package com.mycompany.salat2;

import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Toidutest {
    
    public Toidutest() {
    }
    
    @Test
    public void lisamine() {
        open("http://greeny.cs.tlu.ee:34222/Toiduleht.html");
        $("#kast1").setValue("Kama");
        $("#kast2").setValue("30");
        $("#kast3").setValue("40");
        $("#kast4").setValue("30");
        $("#lisa").click();
        assertEquals("böö", $("#vastus").getAttribute("innerHTML"));
    }
}
