package kontrolltöö2;
public class XjaYliides{
	public double xväärtus;
	public double xkordaja;
	public double yväärtus;
	public double vabaliige;
	public XjaYliides(double xväärtus, double xkordaja, double yväärtus, double vabaliige){
		this.xväärtus=xväärtus;
		this.xkordaja=xkordaja;
		this.yväärtus=(xkordaja * xväärtus)+ vabaliige;
		this.vabaliige= vabaliige;
	}
	public vliige(double vabaliige){
		if (vabaliige < 0.0){return vabaliige;}
		return "+ "+vabaliige;
	}	
	
	public String toString(){
		return "Võrrand:y="+xkordaja+"x "+vliige+".Kui x väärtus on"+xväärtus+", siis y= "+yväärtus;
	}
}	