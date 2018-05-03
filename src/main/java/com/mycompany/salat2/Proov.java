package com.mycompany.salat2;
public class Proov {
    public static void main(String[] args) {
        Toiduaine ta1 = new Toiduaine("Kartul", 30, 10, 60);
        System.out.println(ta1);
        Toiduaine ta2 = new Toiduaine("Petersell", 40, 50, 60);
        System.out.println(ta2);
        Toidukomponent tk1 = new Toidukomponent(ta1, 100);
        System.out.println(tk1);
        Toidukomponent tk2 = new Toidukomponent(ta2, 30);
        System.out.println(tk2);
        double rasvaKogus = tk1.RasvKomponendis();
        System.out.println("Rasva kogus on: " + rasvaKogus + "g.");
    }
}
