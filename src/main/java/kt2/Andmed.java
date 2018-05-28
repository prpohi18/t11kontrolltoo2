//Loo mõni toiduaine (nt. kartul, hapukoor, vorst) - valgud/rasvad/sysivesikud

public class Andmed{
    public static void main(String[] arg){
        Toiduained ta1 = new Toiduained("Kartul",10, 30, 20);
        Toiduained ta2 = new Toiduained("Hapukoor",20, 50, 20);
        Toiduained ta3 = new Toiduained("Vorst",50, 30, 10);

//koosta klass toidukomponendi tarbeks (kogus, viit toiduainele)
        Komponent k1 = new Komponent();
        Komponent k2 = new Komponent();
        Komponent k3 = new Komponent();

//Loo mõned toidukomponendid (nt. 100 g kartuleid, 30 g hapukoort, 50 g vorsti)
        k1.kogus = 100;
        k2.kogus = 30;
        k3.kogus = 50;

        System.out.println("Toiduained: ");
        System.out.println(k1.kogus + " " + ta1.nimetus + "= valke: "+ ta1.valgud + ", rasvu: " + ta1.rasvad + ", susivesikuid: " + ta1.sysivesikud);
        System.out.println(k2.kogus + " " + ta2.nimetus + "= valke: "+ ta2.valgud + ", rasvu: " + ta2.rasvad + ", susivesikuid: " + ta2.sysivesikud);
        System.out.println(k3.kogus + " " + ta3.nimetus + "= valke: "+ ta3.valgud + ", rasvu: " + ta3.rasvad + ", susivesikuid: " + ta3.sysivesikud);
/*
Toiduained:
100.0 Kartul= valke: 10.0, rasvu: 30.0, susivesikuid: 20.0
30.0 Hapukoor= valke: 20.0, rasvu: 50.0, susivesikuid: 20.0
50.0 Vorst= valke: 50.0, rasvu: 30.0, susivesikuid: 10.0
*/

        //Lisa toidukomponendile käsklus selle sees leiduva rasvakoguse arvutamiseks.
        System.out.println("Rasvakogus: ");
        System.out.println(ta1.nimetus + ": " + k1.RasvaKogus() + " grammi");
        System.out.println(ta2.nimetus + ": " + k2.RasvaKogus() + " grammi");
        System.out.println(ta3.nimetus + ": " + k3.RasvaKogus() + " grammi");       
/* 
Rasvakogus:
Kartul: 100.0 grammi
Hapukoor: 30.0 grammi
Vorst: 50.0 grammi
*/
    } 
}