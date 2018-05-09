package main.java;

public class Alleel {
    protected String name;
    protected boolean rhesus; // neg. v pos.


    // Alleli builder (ehitab selle klassi), kahe parameetriga
    // kui siin meetodis ei defineeritaks ära, siis ei saaks nime ja reesust teistes klassides kasutada
    public Alleel(String name, boolean rhesus) {
        this.name = name;
        this.rhesus = rhesus;
    }

    // saab kätte reesuse, mis praegu 0
    public boolean getRhesus() {
        return rhesus;
    }

    public String getName() {
        return name;
    }

    // nyyd määrab Geeni pandud nime ja määrab alleeli nime (koer!!!)
    public void setName(String name) {
        this.name = name;
    }

    public void setRhesus(boolean rhesus) {
        this.rhesus = rhesus;
    }
    @Override
    public String toString() { // overraidib toString meetodit ehk ytleb, et selle asemel, et asukoht väljastada, väljastab konkreetsed väärtused
        return String.format("%s, %s", name, rhesus);
    }
}