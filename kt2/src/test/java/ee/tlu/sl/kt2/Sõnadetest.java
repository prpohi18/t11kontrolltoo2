package ee.tlu.sl.kt2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Sõnadetest {
    
    public Sõnadetest() {}
    
    @Test
    public void tähtedeArv() {
        Sõna pere = new Sõna("pere");
        long mituE = pere.getLetter('e');
        long mituA = pere.getLetter('a');
        long mituP = pere.getLetter('p');
        assertEquals(2, mituE);
        assertEquals(0, mituA);
        assertEquals(1, mituP);
    }
    
    
}
