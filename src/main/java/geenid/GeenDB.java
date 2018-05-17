package geenid;
import java.lang.annotation.Inherited;
import javax.persistence.*;

@Entity
@Table(name="geenid")
public class GeenDB{

	@Id
	public int id;
	public String nimetus;
	public String alleel1;
	public String alleel2;
 
	@Override
	public String toString(){
		return "Geeniks: "+nimetus+" alleel 1: "+alleel1 + " alleel 2: "+alleel2;
	}
 
}


