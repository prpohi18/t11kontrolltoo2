package akordid;

import java.util.Arrays;
import java.util.List;

public class MuusikaAbi {
	   static String[] nimetused={"C", "C#", "D", "Eb", "E", "F", "F#", "G", "G#", "A", "B", "H"};
	   static List<String> nimetusteList=Arrays.asList(nimetused);
	   public static int leiaKorgus(String taht){
		   int koht=nimetusteList.indexOf(taht);
		   return koht+60;
	   }
	   public static String leiaTaht(int korgus){
		   return nimetused[korgus % 12];
	   }
}