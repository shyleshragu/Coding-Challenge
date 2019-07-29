package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.EverOrOdd.evenoddcheck1;
import static ca.jrvs.apps.EverOrOdd.evenoddcheck2;
import static org.junit.Assert.*;

public class EverOrOddTest {

    @Test
    public void evenoddcheck_even() {
        int num = 12;
        assertEquals("Even", evenoddcheck1(num));
        assertEquals("Even", evenoddcheck2(num));
    }

    @Test
    public void evenoddcheck_odd(){
        int num = 13;
        assertEquals("Odd", evenoddcheck1(num));
        assertEquals("Odd", evenoddcheck2(num));
    }
}