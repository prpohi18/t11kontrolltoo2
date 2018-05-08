package geenid;
import javax.persistence.*;

@Entity
@Table(name="geenid")
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
	
	public Alleel juhuslikAlleel(Alleel){
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

	public boolean geeniyhendamine(){
		 alleel1 = juhuslikAlleel();
		 alleel2 = juhuslikAlleel();
		 if(!alleel1.positiivne && !alleel2.positiivne){
		    return false;
		}
		return true;

	}

	
	/*public boolean juhuslikAlleel(){
		String juhulsik = {alleel1, alleel2};
		Boolean[] juhuslik = {alleel1, alleel2};
		return juhuslik [new Random().nextBoolean(juhuslik)];
	}*/

}

	/*public String alleelityyp(){
		//this.reesusPos=reesusPos;
		//this.reesusNeg=reesusNeg;
		//if(reesus){
		if (pos){
			return nimetus + ("on positiivne");
		}
		return nimetus + ("on negatiivne");
	}
	*/