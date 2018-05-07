package kt2;

public class Toiduaine{
    public String nimetus;
    public double valgud;
    public double rasvad;
    public double susivesikud;
    public Toiduaine(String nimetus, double valgud, double rasvad, double susivesikud){
        this.nimetus = nimetus;
        this.valgud = valgud;
        this.rasvad = rasvad;
        this.susivesikud = susivesikud;
    }
    @Override
    public String toString() {
        if ((rasvad + susivesikud) > 100) {
            return "Protsent ei saa olla üle saja!";
        } else {
            return nimetus + ", " + valgud + " g, " + rasvad + " %, " + susivesikud + " %";
        }
    }
}