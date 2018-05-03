import krislyn.kontrolltoo2.Alleelid;
import krislyn.kontrolltoo2.Geenid;
import org.junit.*;
import static org.junit.Assert.*;

public class GeeniTest {

    @Test
	public void contextLoads(){}
    
    @Test
    public void alleeliTest(){
        Alleelid alleel1 = new Alleelid();
        Assert.assertNull(alleel1.getName());
        Assert.assertNull(alleel1.getPositive());
        alleel1.setName("Reesus");
        alleel1.setPositive(true);
        Assert.assertEquals("Reesus", alleel1.getName());
        Assert.assertEquals(true, alleel1.getPositive());
    }
    @Test
    public void geeniTestidAuto(){
        Alleelid alleel1 = new Alleelid();
        Alleelid alleel2 = new Alleelid();
        alleel1.setName("Reesus");
        alleel1.setPositive(false);
        alleel2.setName("RhNegatiivne");
        alleel2.setPositive(true);
        Geenid Geenid = new Geenid(alleel1, alleel2);
        Assert.assertEquals(true, Geenid.getPositive());
        Assert.assertEquals(false, Geenid.getAlleel1().getPositive());
        Assert.assertEquals("RhNegatiivne", Geenid.getAlleel2().getName());
        Geenid.getAlleel2().setPositive(false);
        Geenid.setPositive();
        Assert.assertEquals(false, Geenid.getPositive());
    } 
        
}