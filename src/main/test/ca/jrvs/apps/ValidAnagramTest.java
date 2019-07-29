package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.ValidAnagram.isAnagram;
import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagramTest() {
        assertTrue(isAnagram("anagram","nagaram"));
        assertFalse(isAnagram("son","run"));
    }
}