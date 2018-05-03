package com.mycompany.salat2;

import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Toidutest {
    
    public Toidutest() {
    }
    
    @Test
    public void lisamine() {
        open("http://greeny.cs.tlu.ee:34265/Toiduleht.html");
        $("#kast1").setValue("Kama");
        $("#kast2").setValue("30");
        $("#kast3").setValue("40");
        $("#kast4").setValue("30");
        $("#lisa").click();
        assertEquals("Andmebaasi on lisatud toiduaine: Kama Valk: 30.0 Rasv: 40.0 Süsivesik: 30.0", $("#vastus").getAttribute("innerHTML"));
    }
    
    @Test
    public void eemaldamine() {
        open("http://greeny.cs.tlu.ee:34265/Toiduleht.html");
        $("#kast5").setValue("Kama");
        $("#eemalda").click();
        assertEquals("Toiduaine nimega Kama on andmebaasist eemaldatud.", $("#vastus").getAttribute("innerHTML"));
    }
    
    @Test
    public void vaatamine() {
        open("http://greeny.cs.tlu.ee:34265/Toiduleht.html");
        $("#kast6").setValue("Moos");
        $("#vaata").click();
        assertEquals("Andmebaasis toiduaine nimega Moos. Andmed: Valk - 30.0, Rasv - 10.0, Süsivesik - 50.0.", $("#vastus").getAttribute("innerHTML"));
    }
    
    @Test
    public void otsimine() {
        open("http://greeny.cs.tlu.ee:34265/Toiduleht.html");
        $("#kast7").setValue("10");
        $("#kast8").setValue("50");
        $("#otsi").click();
        assertEquals("bo", $("#vastus").getAttribute("innerHTML"));
    }
}
