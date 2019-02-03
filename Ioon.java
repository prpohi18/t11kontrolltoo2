package tlu.ee.kontrolltoo2;

public class Ioon implements Ioonid{
    String nimetus;
    double aatomMassideSumma;
    int laeng;

    public Ioon(String nimetus, double aatomMassideSumma, int laeng) {
        this.nimetus = nimetus;
        this.aatomMassideSumma = aatomMassideSumma;
        this.laeng = laeng;
    }

    @Override
    public String toString() {
        return "Ioon{" + "nimetus=" + nimetus + ", aatomMassideSumma=" + aatomMassideSumma + ", laeng=" + laeng + '}';
    }
    
    
    
    
    @Override
    public String kysiNimetus() {
        return nimetus;
    }

    @Override
    public double kysiAatomMassideSumma() {
        return aatomMassideSumma;
    }

    @Override
    public int kysiLaeng() {
        return laeng;
    }
    
}