import java.util.*;

public class Geen{

	public Alleel alleel1;
	public Alleel alleel2;
    
    public Geen(Alleel alleel1, Alleel alleel2){
        this.alleel1 = alleel1;
        this.alleel2 = alleel2;
    }
	
	public boolean geenid(){
		if(!alleel1.positiivne && !alleel2.positiivne){
		    return false;
		}
		return true;
	}
	
	public Alleel juhuslikAlleel(){
	    Random juhuslik = new Random();
	    boolean  juhAlleel = juhuslik.nextBoolean();
	    if(juhAlleel){
	        return alleel1;
	        //return true;
	    } else {
	    return alleel2;
		//return false;	
		}
	}

	public Alleel geeniyhendamine(){
		// alleel1 = juhuslikAlleel();
		// alleel2 = juhuslikAlleel();
		Alleel uusGeen = juhuslikAlleel();
	
		return uusGeen;
	}
	/*
	public boolean lapseGeen(){
		return 
	}*/
}

