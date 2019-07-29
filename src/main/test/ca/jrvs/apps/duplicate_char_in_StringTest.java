package ca.jrvs.apps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Hashtable;

import static ca.jrvs.apps.duplicate_char_in_String.duplicateCharFromString;
import static org.junit.Assert.*;

public class duplicate_char_in_StringTest {
    Hashtable<Character, Integer> testMap;

    @Before
    public void setup(){
        this.testMap = new Hashtable<>();
    }
    @Test
    public void duplicateCharFromStringTest1() {
        testMap = duplicateCharFromString("Programming");
        assertEquals(3,testMap.size());
    }

    @Test
    public  void duplicateCharFromStringTest2(){
        testMap = duplicateCharFromString("Combination");
        assertEquals(3,testMap.size());
    }

    @Test
    public void duplicateCharFromStringTest3(){
        testMap = duplicateCharFromString("Hello");
        assertEquals(1,testMap.size());
    }

    @After
    public void removal(){
        testMap.clear();
    }
}