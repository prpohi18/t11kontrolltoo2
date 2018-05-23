package kt;

public class Geen {
	Alleel sisu1;
	Alleel sisu2;
	Geen g1;
	Geen g2;
	
	public Geen (Alleel sisu1, Alleel sisu2) {
		this.sisu1 = sisu1;
		this.sisu2 = sisu2;
	}
	public Geen(Geen g1, Geen g2){
		this.sisu1 = g1.juhuslikAlleel();
		this.sisu1 = g1.juhuslikAlleel();
	}
	public boolean kontroll() {
		if(sisu1.v22rtus || sisu2.v22rtus && sisu1.nimetus==sisu2.nimetus){
			return true;
		}
		else {
			return false;
		}
	}
	public Alleel juhuslikAlleel(){
		
		int juhuslik = (Math.random() <= 0.5) ? 1 : 2;
		if(juhuslik == 1){
			return sisu1;
		}
		else{
			return sisu2;
		}
	}
	public Geen juhuslikGeen(){
		
		int juhuslik = (Math.random() <= 0.5) ? 1 : 2;
		if(juhuslik == 1){
			return g1;
		}
		else{
			return g1;
		}
	}
}


