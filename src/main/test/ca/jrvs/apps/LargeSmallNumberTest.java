package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.LargeSmallNumber.largesmallNum;
import static org.junit.Assert.*;

public class LargeSmallNumberTest {

    @Test
    public void largesmallNumTest() {
        int[] num = {-20,34,21,-87,92};
        int[] arr = largesmallNum(num);
        assertEquals(-87, arr[0]);
        assertEquals(92, arr[1]);
    }
}