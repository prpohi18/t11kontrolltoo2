package main.java;

import static org.junit.Assert.*;

public class GeenTest {

    @org.junit.Test
    public void checkRhesus() {
        // loon testimiseks 3 alleeli
        Alleel test1 = new Alleel("test1", true);
        Alleel test2 = new Alleel("test2", false);
        Alleel test3 = new Alleel("test3", false);

        // loon testimiseks yhe geeni
        Geen geen1 = new Geen(test1, test2);
        Geen geen2 = new Geen(test2, test3);

        assertEquals("positiivne", geen1.checkRhesus(test1, test2));
        assertEquals("negatiivne", geen2.checkRhesus(test2, test3));
    }
}