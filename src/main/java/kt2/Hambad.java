package kt2;

public class Hambad{
	public int loetudhambad;
	public int hammastearv;
	public Hambad(int loetudhambad, int hammastearv){
		this.hammastearv=hammastearv;
		this.loetudhambad=loetudhambad;
	}
	@Override
	public String toString(){
		return "Hammaste arv: "+hammastearv;
	}
	public void suurendahammastearv(){
		loetudhambad += 1;
	}
}