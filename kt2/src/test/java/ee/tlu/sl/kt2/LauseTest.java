package ee.tlu.sl.kt2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LauseTest {
    
    public LauseTest() {
    }

    /**
     * Test of getWords method, of class Lause.
     */
    @Test
    public void testGetWordCount() {
        System.out.println("getWordCount");
        Lause instance = new Lause("kuidas sul läheb");
        int expResult = 3;
        int result = instance.getWordCount();
        assertEquals(expResult, result);
    }
}
