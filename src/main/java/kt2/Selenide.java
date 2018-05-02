package kt2;

import static com.codeborne.selenide.Selenide.*;

public class Selenide {

  public static void main(String[] args) {
    open("file:///Users/TLÜ/II/Programmeerimise_põhikursus/homework/t11kontrolltoo2/funktsioon.html");
    $("#kast1").setValue("2");
    $("#kast2").setValue("1");
    $("#kast3").setValue("2");
    $("#kast4").setValue("4");
    $("#nupp").click();
    System.out.println("Oodatav vastus y = [5, 7, 9]" + $("#vastus").getValue());
  }
}