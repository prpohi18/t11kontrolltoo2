package main.java;

public class GeeniApp {
    public static void main(String[] args) {
        // loon 2 alleeli
        Alleel roosaAlleel = new Alleel("roosa", true);
        Alleel sinineAlleel = new Alleel("sinine", false);
        Alleel kollaneAlleel = new Alleel("kollane", false);

        System.out.println(newGeen());
       /* // loon geeni
        Geen proov1 = new Geen(roosaAlleel, sinineAlleel);
        Geen proov2 = new Geen(roosaAlleel, kollaneAlleel);
        /*Geen proov3 = new Geen();
        See default bulder ei tööta, sest ei võta kaasa geen proov1 ja geen proov2 väärtusi, ytleb, et tyhi!

        proov3.newGeen(proov1, proov2);
        proov3.checkRhesus(proov3.getAlleel1(), proov3.getAlleel2());
        System.out.println(String.format("Loodi uus Geen mille alleel 1 = %s ja alleel 2 = %s.\n" +
                "Uue geeni reesus on seega: %s" , proov2.getAlleel1(), proov2.getAlleel2() , proov2.checkRhesus(proov2.getAlleel1(), proov2.getAlleel2())));
     */
    }
       public static String newGeen() {
           Alleel alleel1 = new Alleel("reesus positiivne", true);
           Alleel alleel2 = new Alleel("reesus negatiivne", false);

           Geen geen1 = new Geen(alleel1, alleel2);
           Geen geen2 = new Geen(alleel1, alleel2);

           Alleel geen1RandomAlleel = geen1.randAlleel(alleel1, alleel2);
           Alleel geen2RandomAlleel = geen2.randAlleel(alleel1, alleel2);
           Geen newChildGeen = new Geen(geen1RandomAlleel, geen2RandomAlleel);


           return "Loodi uus geen: nimega uusGeen ja tema reesus on: " + newChildGeen.checkRhesus(geen1RandomAlleel, geen2RandomAlleel) + "\n alleel 1 = "  + geen1RandomAlleel.getRhesus() + "\n alleel 2 = " + geen2RandomAlleel.getRhesus();

    }
}
