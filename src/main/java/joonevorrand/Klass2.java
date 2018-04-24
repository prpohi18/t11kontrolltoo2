package joonevorrand;
public class Klass2{
	public static void main(String[] arg){
		Joon x1 = new Joon();
		x1.kordaja=3;
		x1.vabaliige=0;
		double y1 = x1.leiaY(1.0);
		double y2 = x1.leiaY(0.0);
		double y3 = x1.leiaY(-1.0);
	}
}