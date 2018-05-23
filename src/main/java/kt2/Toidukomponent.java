package kt2;

public class Toidukomponent {
    double kogus;
    Toiduaine sisu;
    public Toidukomponent(double kogus, Toiduaine sisu) {
        this.kogus = kogus;
        this.sisu = sisu;
    }
    public double rasvakogus() {
        return (kogus * (sisu.rasvad / 100));
    }
    @Override
    public String toString() {
        return "kogus: " + kogus + " g" +", sisu: " + sisu + ", rasvakogus: " + rasvakogus();
    }
}
