package ca.jrvs.apps;

import org.junit.Test;

import static ca.jrvs.apps.ReverseWords.reverseWords;
import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void reverseWordsTest() {
        String word = "the sky is blue";
        assertEquals("blue is sky the ", reverseWords(word));
    }
}