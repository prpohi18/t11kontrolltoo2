
package ttaevik.tlu.kt;


public class Sentence implements Letter{
    
    public String sentence;
    
    public Sentence(String sentence){
        this.sentence = sentence;
    }
    
    @Override
    public int getLetterCount(char letter){
    int counter = 0;
    for( int i=0; i<sentence.length(); i++ ) {
        if( sentence.charAt(i) ==  letter) {
            counter++;
        }
    }
    return counter;
    }
    
    public int getWordCount (){
        String[] words = sentence.trim().split(" ");
        return words.length;
    }
    
    public Word[] getWordsArray(){
        String[] words = sentence.trim().split(" ");
        Word[] wordarray = new Word[words.length];
        for( int i = 0; i < words.length; i++){
            wordarray[i] = new Word(words[i]);
        }
        
        return wordarray;
    }
}
