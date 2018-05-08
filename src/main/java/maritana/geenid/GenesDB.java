package maritana.geenid;

import javax.persistence.*;
// import jdk.nashorn.internal.ir.annotations.Immutable;

@Entity
@Table (name="Genes")

public class GenesDB {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id;
    public String name;
    public String allele1;
    public String allele2;

    @Override
    public String toString(){
        return "geen: " +name + "alleel 1: " + allele1 + "alleel 2: " + allele2;
    }
}
