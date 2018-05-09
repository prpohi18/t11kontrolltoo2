package main.java;

import java.util.Random;

public class Geen {
    private Alleel alleel1;

    public Geen(){

    }

    public Alleel getAlleel1() {
        return alleel1;
    }

    public void setAlleel1(Alleel alleel1) {
        this.alleel1 = alleel1;
    }

    public Alleel getAlleel2() {
        return alleel2;
    }

    public void setAlleel2(Alleel alleel2) {
        this.alleel2 = alleel2;
    }

    private  Alleel alleel2; // nyyd yks geen koosneb kahest alleelist

    // public Geen(KLASSINIMI muutujanimi[enamasti sama, mis klassis, aga võib olla muu], KLASSINIMI muutujanimi2)
    // pmt defineerin, milline geen on ja mida saab temaga teha, aga see EI OLE geeni loomine (idee, koer!!!)
    public Geen (Alleel alleel1, Alleel alleel2) {
        this.alleel1 = alleel1;
        this.alleel2 = alleel2;
    }

    // teen f-ni, mis väljastab pos, kui vähemalt yks alleel on pos
    public String checkRhesus(Alleel alleel1, Alleel alleel2) {
        if(alleel1.getRhesus() || alleel2.getRhesus() == true) {
            return "positiivne";
        } else {
            return "negatiivne";
        }
    }

    // teen f-ni, mis väljastab random alleli
    public Alleel randAlleel(Alleel alleel1, Alleel alleel2) {
        Random rnd = new Random(); // teeb automaatselt numbri 0 ja 1 vahel
        if(rnd.nextBoolean() == true) { // kui rnd on lähemal yhele kui nullile siis on true
            return alleel1;
        } else { // kui on lähemal 0-ile
            return alleel2;
        }
    }
    /*
    // teen f-ni, mis kahe random geeni yhinemisel tekitab uue geeni
    public Geen newGeen(Geen geen1, Geen geen2) {
        Geen newGeen = new Geen(geen1.randAlleel(alleel1, alleel2), geen2.randAlleel(alleel1, alleel2));
        return  newGeen;
    }
    */
    @Override
    public String toString() { // overraidib toString meetodit ehk ytleb, et selle asemel, et asukoht väljastada, väljastab konkreetsed väärtused
        return String.format("%s, %s", alleel1, alleel2);
    }
}


