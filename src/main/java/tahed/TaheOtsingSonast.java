package tahed;
public class TaheOtsingSonast implements Taheloendur{
	String sona;
	char taht;
	public TaheOtsingSonast(String sona){
		this.sona = sona;
	}
	public int loeTahti(char a){
		taht = a;
		int mitu=0;
		for(int i=0; i<sona.length(); i++){
			if(sona.charAt(i)==a){
				mitu++;
			} 
		}
		return mitu;
	}
	public String kysiSona(){
		 return sona;
	}
	public char kysiTaht(){
		return taht;
	}
}