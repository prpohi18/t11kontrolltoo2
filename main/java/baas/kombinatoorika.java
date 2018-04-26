package baas;
import javax.persistence.*;

@Entity
@Table(name="kombinatoorika")
public class kombinatoorika{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int id;
    public int numn;
    public int numm;
    public int result;
    public int times;
}