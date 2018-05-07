package kt;

public class Pendulum {
    double period;
    double length;
    int ticks = 0;
    int rounds = 0;


    public Pendulum(double length) {
        this.length = length;
    }

    public double formula() {
        period = Math.sqrt(length / 9.8) * Math.PI * 2;
        return period;
    }

    public String round(Gear teeth) {

        ticks += 1;
        if (ticks >= teeth.gears()) {
            rounds += 1;
            ticks = 0;
            return "tik \nRinge tehtud: " + rounds;
        }

        return "tik";


    }


    public String answer() {
        return "periood: " + formula();
    }


}
