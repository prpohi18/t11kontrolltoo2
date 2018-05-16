package javakt2;

import javakt2.arvutused;
import org.junit.Test;
import static org.junit.Assert.*;

public class KT2test {
    
    @Test
    public void KT2test() {
        //loon uue objekti testimiseks
        arvutused uusPohikolaTest = new arvutused();
        
        //annan uuele objektile sisendi
        uusPohikolaTest.sisestamine(60);
        
        //kontrollin, kas objekt loob oige kvarti ja tertsi
        assertEquals(64, arvutused.kvint);
        assertEquals(67, arvutused.terts);
                
    }

}
