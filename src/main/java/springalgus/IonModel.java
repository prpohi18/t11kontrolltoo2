package springalgus;

public class IonModel implements IonLiides{
    private String nimetus;
    private Double massSumma;
    private int laeng;
    
    @Override
    public void setData(String nimetus, Double mass, int laeng){
        this.nimetus = nimetus;
        this.massSumma = mass;
        this.laeng = laeng;
        
    }
    
    @Override
    public String getNimetus(){
        return this.nimetus;
    }
    
    @Override
    public int getLaeng(){
        return this.laeng;
    }
    
    @Override
    public Double getMass(){
        return this.massSumma;
    }
}
