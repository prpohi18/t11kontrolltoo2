package joonevorrand;
public class Klass2{
	public static void main(String[] arg){
		Joon x1 = new Joon();
		/* y=3x */
		x1.kordaja=3;
		x1.vabaliige=0;
		double y1 = x1.yLeidmine(2.0);
		double y2 = x1.yLeidmine(-2.0);
		double y3 = x1.yLeidmine(10.5);
		double y4 = x1.yLeidmine(-0.5);
	}
}