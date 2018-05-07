package joonevorrand;

public class ArvutamineMassiiviga {
    public static double[] arvutaMassiiviga(double kordaja, double[] x, double vabaliige) {
        
        double[] y = new double[x.length];
        
        if (vabaliige == 0) {
            for (int i=0; i<x.length; i++) {
                y[i] = Arvutamine.arvutaKordajaga(kordaja, x[i]);
            }
        } else {
            for (int i=0; i<x.length; i++) {
                    y[i] = ArvutamineVabaliikmega.arvutaVabaliikmega(kordaja, x[i], vabaliige);
            }
        }
        return y;
    }
}