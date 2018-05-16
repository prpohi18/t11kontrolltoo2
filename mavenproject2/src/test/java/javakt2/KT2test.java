package javakt2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javakt2.arvutused;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kaur
 */
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
