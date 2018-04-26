/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttriisa.triisakt2;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static java.lang.Integer.parseInt;
import org.openqa.selenium.By;
/**
 *
 * @author zeus
 */
public class testid1 {
   public testid1(){}
   @Test
   public void avamine(){
        open("http://greeny.cs.tlu.ee/~triiteet/javakt2/kombinatoorika.html");
        $("h1").shouldHave(text("Kombinatsioonide leidmine"));
        assertEquals("Arvuta", $("#find").getAttribute("innerHTML"));
   }
   @Test
   public void testid(){
        open("http://greeny.cs.tlu.ee/~triiteet/javakt2/kombinatoorika.html");
        $("#num1").setValue("5");
        $("#num2").setValue("3");
        $("#find").click();
        assertEquals("10", $("#result").getAttribute("innerHTML"));
      
        $("#num1").setValue("10");
        $("#num2").setValue("5");
        $("#find").click();
        assertEquals("252", $("#result").getAttribute("innerHTML"));
      
        $("#num1").setValue("50");
        $("#num2").setValue("2");
        $("#find").click();
        assertEquals("1225", $("#result").getAttribute("innerHTML"));
   }
   
   @Test
   public void avamine2(){
        open("http://greeny.cs.tlu.ee:45454/kombinatoorika.html");
        $("h1").shouldHave(text("Kombinatsioonide leidmine"));
        assertEquals("Arvuta", $("#find").getAttribute("innerHTML"));
   }
   @Test
   public void testid2(){
        open("http://greeny.cs.tlu.ee:45454/kombinatoorika.html");
        $("#num1").setValue("5");
        $("#num2").setValue("3");
        $("#find").click();
        String tmp = $("#result").getAttribute("innerHTML");
        assertEquals("10", tmp.substring(0, tmp.indexOf(" ")));
      
        $("#num1").setValue("10");
        $("#num2").setValue("5");
        $("#find").click();
        tmp = $("#result").getAttribute("innerHTML");
        assertEquals("252", tmp.substring(0, tmp.indexOf(" ")));
      
        $("#num1").setValue("25");
        $("#num2").setValue("3");
        $("#find").click();
        tmp = $("#result").getAttribute("innerHTML");
        assertEquals("2300", tmp.substring(0, tmp.indexOf(" ")));
   }

   @Test
   public void loendurTest(){
        open("http://greeny.cs.tlu.ee:45454/kombinatoorika.html");
        $("#num1").setValue("5");
        $("#num2").setValue("3");
        $("#find").click();
        String tmp = $("#result").getAttribute("innerHTML");
        tmp = tmp.substring(tmp.indexOf("(")+1, tmp.length());
        tmp = tmp.substring(0, tmp.length()-1);
        int tmp2 = parseInt(tmp);
        $("#num1").setValue("5");
        $("#num2").setValue("3");
        $("#find").click();
        tmp = $("#result").getAttribute("innerHTML");
        tmp = tmp.substring(tmp.indexOf("(")+1, tmp.length());
        tmp = tmp.substring(0, tmp.length()-1);
        assertEquals(tmp2 + 1, parseInt(tmp));
   }
}
/*

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
*/