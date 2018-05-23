package kt2;

/* Klass toiduaine tarbeks(nimetus, valkude, rasvade ja süsivesikute protsent). Protsent kokku ei saa ületada 100
muidu antakse veateade. Loo mõni toiduaine (nt. kartul, hapukoor, vorst).Koosta klass toidukomponendi tarbeks (kogus, viit toiduainele).
Loo mõned toidukomponendid(nt. 100g kartuleid, 30g hapukoort, 50g vorsti). Lisa toidukomponendile käsklus selle sees leiduva
rasvakoguse arvutamiseks.
 */

public class Toiduaine {
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
