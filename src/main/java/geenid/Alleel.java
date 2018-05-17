package geenid;

public class Alleel{
	public String nimetus;
	public boolean positiivne;
	
	public Alleel(String nimetus, boolean positiivne){
		this.nimetus = nimetus;
		this.positiivne = positiivne;
	}

	public String alleeliNimi(){
		return nimetus;
	}
		
	public boolean alleelPos(){
	    return positiivne;
	}
}