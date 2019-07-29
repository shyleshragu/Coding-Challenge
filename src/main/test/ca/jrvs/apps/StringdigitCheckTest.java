package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.StringdigitCheck.isSdigit;
import static org.junit.Assert.*;

public class StringdigitCheckTest {

    @Test
    public void isSdigitTest() {
        String[] text1 = {"1234", "123654"};    //true cases
        String[] text2 = {"123.45678","123/45678","123A45678","abcde"};     //false cases

        for (String input : text1)
            assertTrue(isSdigit(input));

        for (String input : text2)
            assertFalse(isSdigit(input));
    }
}