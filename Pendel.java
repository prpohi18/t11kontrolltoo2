public class Pendel{
	
	private double vP;
	double pikkus;
	int tiks = 0;
	int r = 0;
	
	
	Pendel(double pikkus){
		vP = 2 * Math.PI * Math.sqrt(pikkus/9.8); //kontrolltöö juhisest
		this.pikkus = pikkus;
	}
	
	public double vP(){
		return vP;
	}
	
	public int ringid(Hammasratas h){
		if(tiks == h.hammasteArv() + r * h.hammasteArv())
			r += 1;
		return r;
	}
	
	public String valjasta(){
		return "TIKK TAKK";
	}
	
}

