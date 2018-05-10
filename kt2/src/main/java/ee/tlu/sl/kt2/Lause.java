package ee.tlu.sl.kt2;

import java.util.StringTokenizer;

public class Lause implements LauseInterf {
    
    public String lause;
    public Sõna[] sõnad;
    
    public Lause(String lause) {
        this.lause = lause;
        int i = 0;
        StringTokenizer st = new StringTokenizer(lause);
        sõnad = new Sõna[st.countTokens()];
        while (st.hasMoreTokens()) {
            sõnad[i] = new Sõna(st.nextToken());
            i++;
        } // katseta splitiga
    }
    
    @Override
    public int getWordCount() {
        /* StringTokenizer sõnadeks = new StringTokenizer(lause);
        return sõnadeks.countTokens(); */
        return sõnad.length;
    }
    
    @Override
    public Sõna[] getWords() {
        return sõnad;
    }
}
