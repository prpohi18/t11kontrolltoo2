package kt;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void formula() {
        Pendulum Pendel = new Pendulum(1);
        assertEquals(2.00708, Pendel.formula(), 0.001);
    }
}