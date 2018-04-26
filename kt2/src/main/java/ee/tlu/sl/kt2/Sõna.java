package ee.tlu.sl.kt2;

public class Sõna implements SõnaInterf {
    
    public String sisend;
    
    public Sõna(String sisend) {
        this.sisend = sisend;
    }
    
    public long getLetter(char täht) {
        return sisend.chars().filter(ch -> ch == täht).count(); 
    }

    @Override
    public long getLetter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
