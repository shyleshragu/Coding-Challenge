package ca.jrvs.apps;

import org.junit.Test;

import java.util.DoubleSummaryStatistics;

import static ca.jrvs.apps.MissingNumber.missingNum;
import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingNumTest() {
        int[] num = {3,0,1};
        System.out.print("missing -> ");
        assertTrue(missingNum(num));
    }

    @Test
    public void missingNumTestfail(){
        int[] num = {0,1,2,3,4,5};
        System.out.print("missing -> ");
        assertFalse(missingNum(num));
    }
}