package joonevorrand;

public class Joon implements JooneLiides{
	
	int kordaja;
	int vabaliige;
	public double leiaY(double x) {
		return x*kordaja+vabaliige;	
	}
	public double[] leiaYMassiiv(double[] xid) {
		double[] yid;
		yid=new double[xid.length];
		for(int i = 0; i< xid.length; i++){
			yid[i]=xid[i]*kordaja+vabaliige;
		}
		return yid;
	}
}