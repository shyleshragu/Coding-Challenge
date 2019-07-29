package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.ContainsDuplicate.isDuplicate;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void isDuplicateTest() {
        int[] arr = {1,2,3,1};
        assertTrue(isDuplicate(arr));
    }

    @Test
    public void isDuplicateTestFail(){
        int[] arr = {1,2,3,4};
        assertFalse(isDuplicate(arr));
    }
}