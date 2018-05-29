package teinekt;
public class Proov{
    public static void main(String[] args) {
        Kolmkola kk = new Kolmkola(10);

        System.out.println(kk);

        CKolmkola ck = new CKolmkola();
        FKolmkola fk = new FKolmkola();
        GKolmkola gk = new GKolmkola();
        
        System.out.println(ck);
        System.out.println(fk);
        System.out.println(gk);
    }
}