package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.DuplicateNumber.duplicateNum;
import static org.junit.Assert.*;

public class DuplicateNumberTest {

    @Test
    public void duplicateNumTest() {
        int[] num = {1,3,4,2,2};
        assertEquals(2,duplicateNum(num));
    }

    @Test
    public void duplicateNumTestFail(){
        int[] num = {1,2,3,4,5};
        assertEquals(0, duplicateNum(num));
    }

}