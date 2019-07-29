package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.RemoveElement.removeElement;
import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElementTest() {
        int[] arr = {3,2,2,3};
        int val = 3;

        assertEquals(2, removeElement(arr, val));
    }
}