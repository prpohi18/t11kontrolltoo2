package joonevorrand;
public class Klass1{
	public static void main(String[] arg){
		Joon x1 = new Joon();
		/* y=3x ehk x kordaja on 3*/
		x1.kordaja=3;
		double y1 = x1.yLeidmine(2.0);
		double y2 = x1.yLeidmine(-2.0);
		double y3 = x1.yLeidmine(10.5);
		double y4 = x1.yLeidmine(-0.5);
	}
}