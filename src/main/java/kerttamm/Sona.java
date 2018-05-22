package kerttamm;

public class Sona implements Tahed {
    
    public String word;
    
    public Sona(String word){
        this.word = word;
    }
    
    /*public void setWord(String word){
        this.word = word;
    }*/
    
    public String getWord(){
    return word;
    }
    
    @Override
    public int saaTahtedeArv(char letter){
    int loendur = 0;
    for( int i=0; i<word.length(); i++ ) {
        if( word.charAt(i) ==  letter) {
            loendur++;
        }
    }
    return loendur;
    }
    
}
