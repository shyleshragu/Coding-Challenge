package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.PalindromeValid.isPalindrome;
import static org.junit.Assert.*;

public class PalindromeValidTest {

    @Test
    public void isPalindromeTest1() {
        assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(isPalindrome("race a car"));
        assertTrue(isPalindrome("ama"));
    }
}