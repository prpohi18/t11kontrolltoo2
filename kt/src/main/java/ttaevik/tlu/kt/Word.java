
package ttaevik.tlu.kt;


public class Word implements Letter {
    
    public String word;
    
    public Word(String word){
        this.word = word;
    }
    
    /*public void setWord(String word){
        this.word = word;
    }*/
    
    public String getWord(){
    return word;
        
    }
    
    @Override
    public int getLetterCount(char letter){
    int counter = 0;
    for( int i=0; i<word.length(); i++ ) {
        if( word.charAt(i) ==  letter) {
            counter++;
        }
    }
    return counter;
    }
    
}
