package ee.tlu.elinorr.ioonid;
public class Ioon implements Ioonid{    
    String nimetus;
    int aatommass;
    int laeng;

    public Ioon(String nimetus, int aatommass, int laeng) {
       this.nimetus = nimetus;
       this.aatommass = aatommass;
       this.laeng = laeng;
    }
    @Override
    public String kysiNimetus(){
        return nimetus;
    }
    @Override
    public int kysiAatommass(){
        return aatommass;
    }
    @Override
    public int kysiLaeng(){
        return laeng;
    }
}    
