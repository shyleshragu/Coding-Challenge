package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.PowerOfTwo.poweroftwo;
import static ca.jrvs.apps.PowerOfTwo.poweroftwo2;
import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void poweroftwoTest() {
        int num = 4;
        assertTrue(poweroftwo(num));
    }

    @Test
    public void poweroftwo2Test() {
        int num = 4;
        assertTrue(poweroftwo2(num));
    }

    @Test
    public void poweroftwoTestFail(){
        int num = 7;
        assertFalse(poweroftwo(num));
        assertFalse(poweroftwo2(num));
    }
}