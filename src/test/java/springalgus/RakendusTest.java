package springalgus;
import org.junit.*;
import springalgus.AineModel;
import springalgus.IonModel;
import static org.junit.Assert.*;

public class RakendusTest {
    IonModel testObject = new IonModel();
    IonModel testObject2 = new IonModel();
    AineModel aine = new AineModel();
    @Test
    public void IonDataTest(){
        testObject.setData("H", 1.008, 1);
        assertEquals(testObject.getNimetus(), "H");
        assertEquals(1.008, testObject.getMass(),0.0);
        assertEquals(1, testObject.getLaeng(), 0.0);
    }
    @Test
    public void AineDataTest(){
        testObject.setData("H", 1.008, 1);
        testObject2.setData("NO3",62.01 ,-1);
        aine.createAine(testObject, testObject2);
        
        assertEquals(aine.getNimetus(), "HNO3");
        assertEquals(63.018, aine.getMass(), 0.0);
    }
}
