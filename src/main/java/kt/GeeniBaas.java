package kt;
import javax.persistence.*;

@Entity
@Table(name="geenid")
public class GeeniBaas{
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    public String nimetus;
    public boolean esimenev22rtus;
	public boolean teinev22rtus;
} 