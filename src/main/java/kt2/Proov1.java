package kt2;

public class Proov1 {
    public static void main(String[] args) {
        Toiduaine t1 = new Toiduaine("kartul", 1.4, 0.2, 14.1);
        Toiduaine t2 = new Toiduaine("hapukoor", 2.8, 3.2, 4.5);
        Toiduaine t3 = new Toiduaine("vorst", 16.9, 9.9, 0.1);
        Toidukomponent k1 = new Toidukomponent(100, t1);
        Toidukomponent k2 = new Toidukomponent(30, t2);
        Toidukomponent k3 = new Toidukomponent(50, t3);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}
