package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.RemoveDuplicates.removeDuplicates;
import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicatesTest() {
        int[] arr = {1,1,2,2,3,4,5,6,6};
        assertEquals(6, removeDuplicates(arr));
    }

    @Test
    public void removeDuplicateTest2(){
        int[] arr = {};
        assertEquals(0,removeDuplicates(arr));
    }
}