package ee.tlu.taavim.kontroll2;

public class Aine implements Ained {

    public String nimetus;
    public double molekulMass;
    public Ioon i1;
    public Ioon i2;

    public Aine(Ioon i1, Ioon i2) {
        if (i1.kysiLaeng() > 0 && i2.kysiLaeng() < 0) {
            if (i1.kysiLaeng() == (i2.kysiLaeng() * -1)) {
                this.nimetus = i1.kysiNimetus() + i2.kysiNimetus();
                this.molekulMass = i1.kysiAatomMassideSumma() + i2.kysiAatomMassideSumma();
                this.i1 = i1;
                this.i2 = i2;
            }

        } else if (i2.kysiLaeng() > 0 && i1.kysiLaeng() < 0) {
            if (i2.kysiLaeng() == (i1.kysiLaeng() * -1)) {
                this.nimetus = i2.kysiNimetus() + i1.kysiNimetus();
                this.molekulMass = i1.kysiAatomMassideSumma() + i2.kysiAatomMassideSumma();
                this.i1 = i1;
                this.i2 = i2;
            }

        }

    }

    @Override
    public String kysiNimetus() {
        return nimetus;
    }

    @Override
    public double kysiMolekulMass() {
        return molekulMass;
    }

}
