package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.TwoSum.twoSum;
import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        String output = twoSum(num, target);

        assertEquals("2 + 7 = 9", output);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSumTestfail() throws Exception{
        int[] num = {1,2,3,6};
        int target = 15;
        String output = twoSum(num, target);
    }
}