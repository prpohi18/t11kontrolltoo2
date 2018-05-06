package tahed;
 public class Lause implements Taheloendur{
 	String lause=" ";
 	TaheOtsingSonast[] m;

 	public void lisaMassiivi(String tekst){
 		lause=tekst;
 		String[] sonad = tekst.split(" ");
 		m = new TaheOtsingSonast[sonad.length];
 		for(int i = 0; i < sonad.length; i++){
 			m[i] = new TaheOtsingSonast(sonad[i]);

 		}
 	}
 	public String kysiLause(){
 		return lause;
 	}

 	public TaheOtsingSonast[] kysiSonad(){
 		return m;
 	}
	public int loeTahti(char a){
		int counter = 0;
		for( int i=0; i<m.length; i++ ) {
			counter += m[i].loeTahti(a);
		}
	   return counter;
	}
	
 	public int mituSona(){
		return m.length;
 	}

 }