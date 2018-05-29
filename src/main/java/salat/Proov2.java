package salat;

public class Proov2{
    public static void main(String[] args) {
        Toiduaine t1 = new Toiduaine("kartul", 1.71, 15.3, 20.01);
        Toiduaine t2 = new Toiduaine("hapukoor", 2.9, 30, 10.2);
        Toiduaine t3 = new Toiduaine("vorst", 1.02, 27, 5.8);
        Toidukomponent k1 = new Toidukomponent(100, t1);
        Toidukomponent k2 = new Toidukomponent(30, t2);
        Toidukomponent k3 = new Toidukomponent(50, t3);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}
