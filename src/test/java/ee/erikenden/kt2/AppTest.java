package ee.erikenden.kt2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void testMajorThird(){
        Tritone tri = new Tritone(60);
        assertTrue(tri.majorThird == 64);
    }
    @Test
    public void testPerfectFifth(){
        Tritone tri = new Tritone(60);
        assertTrue(tri.perfectFifth == 67);
    }
    @Test
    public void testDifferenceFromC(){
        Tritone tri = new Tritone(60);
        assertTrue(tri.differenceFromC(64) == 4);
    }
    @Test
    public void testConvertToLetter(){
        Tritone tri = new Tritone(60);
        assertTrue(tri.convertToLetter(15) == "Eb");
    }
}
