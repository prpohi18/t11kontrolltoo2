package com.mycompany.salat2;
public class Toidukomponent {
    public int kogus;
    public Toiduaine toit;
    
    public Toidukomponent (Toiduaine toit, int kogus) {
        this.toit = toit;
        this.kogus = kogus;
    }
    
    public double RasvKomponendis () {
        return kogus * toit.rasv / 100;
    }
    
    @Override
    public String toString () {
        return toit + ", Kogus: " + kogus;
    }
}
