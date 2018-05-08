package maritana.geenid;

public class Allele {
    public String name;
    public boolean value;
    //public boolean isPositive;

    public Allele(String name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public boolean isPositive(){
        return value;
    }
}
