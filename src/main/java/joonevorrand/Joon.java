package joonevorrand;

public class Joon implements JooneLiides{
	
	double kordaja;
	double vabaliige;

	public double yLeidmine(double x) {
		return x*kordaja+vabaliige;	
	}
	
	
	public double[] yLeidmineMassiiv(double[] x) {
		double[] y;
		y=new double[x.length];
		for(int i = 0; i< x.length; i++){
			y[i]=x[i]*kordaja+vabaliige;
		}
		return y;
	}
}