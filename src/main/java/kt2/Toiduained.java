
//Koosta klass toiduaine tarbeks (nimetus, valkude, rasvade ja süsivesikute protsent)
public class Toiduained{
    String nimetus;
    double valgud;
    double rasvad;
    double sysivesikud;

    public Toiduained(String nimetus, double valgud, double rasvad, double sysivesikud){
        this.nimetus = nimetus;
        this.valgud = valgud;
        this.rasvad = rasvad;
        this.sysivesikud = sysivesikud;
    
    //Protsent kokku ei saa ületada 100 - muidu antakse veateade. 
        if(valgud + rasvad + sysivesikud > 100){
            throw new RuntimeException("Error - protsent on suurem kui 100%");
        }
    }
}
