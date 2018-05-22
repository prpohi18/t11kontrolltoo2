package kerttamm;

public class Lause implements Tahed {
    
    public String sentence;
    
    public Lause(String sentence){
        this.sentence = sentence;
    }
    
    @Override
    public int saaTahtedeArv(char letter){
    int loendur = 0;
    for( int i=0; i<sentence.length(); i++ ) {
        if( sentence.charAt(i) ==  letter) {
            loendur++;
        }
    }
    return loendur;
    }
    
    public int getWordCount (){
        String[] words = sentence.trim().split(" ");
        return words.length;
    }
    
    public Sona[] saaSonadeMassiiv(){
        String[] sonad = sentence.trim().split(" ");
        Sona[] sonademassiiv = new Sona[sonad.length];
        for( int i = 0; i < sonad.length; i++){
            sonademassiiv[i] = new Sona(sonad[i]);
        }
        
        return sonademassiiv;
    }
}
