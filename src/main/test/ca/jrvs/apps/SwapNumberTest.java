package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.SwapNumber.swapNumber1;
import static ca.jrvs.apps.SwapNumber.swapNumber2;
import static org.junit.Assert.*;

public class SwapNumberTest {

    @Test
    public void swapNumber1Test() {
        int a = 1; int b = 2;
        int[] newint = swapNumber1(a,b);
        assertEquals(2,newint[0]);
        assertEquals(1,newint[1]);
    }

    @Test
    public void swapNumber2Test() {
        int a = 1; int b = 2;
        int[] newint = swapNumber2(a,b);
        assertEquals(2,newint[0]);
        assertEquals(1,newint[1]);
    }
}