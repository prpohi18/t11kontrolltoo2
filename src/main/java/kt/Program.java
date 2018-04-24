package kt;


public class Program {
    public static void main(String[] arg) throws InterruptedException {
        int time;

        Pendulum p1 = new Pendulum(1);
        Gear g1 = new Gear(3);

        time = (int) (1000 * p1.formula());

        System.out.println("Hammasrattal hambaid: " + g1.gears());
        System.out.println("Pendli pikkus: " + p1.length);

        while (true) {
            Thread.sleep(time);
            System.out.println(p1.round(g1));
            //System.out.println(p1.answer());
        }

    }
}
