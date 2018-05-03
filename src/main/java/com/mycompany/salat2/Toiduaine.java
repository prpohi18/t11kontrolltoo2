package com.mycompany.salat2;
public class Toiduaine {
    public String nimetus;
    public double valk;
    public double rasv;
    public double sysivesik;
    public double kokkuProtsent;
    
    public Toiduaine (String nimetus, double valk, double rasv, double sysivesik) {
        kokkuProtsent = valk + rasv + sysivesik;
        if (kokkuProtsent > 100) {
            System.out.println("Protsent ei saa olla rohkem kui 100!");
        } else {
            this.nimetus = nimetus;
            this.valk = valk;
            this.rasv = rasv;
            this.sysivesik = sysivesik;
        }
    }
    
    @Override
    public String toString () {
        if (kokkuProtsent <= 100) {
            return nimetus + ", Valk: " + valk + "%, Rasv: " + rasv + "%, Süsivesik: " + sysivesik + "%, Protsent kokku: " + kokkuProtsent; 
        } else {
            return "Sinu sisestatud protsent oli liiga suur: " + kokkuProtsent;
        }
    }
}
