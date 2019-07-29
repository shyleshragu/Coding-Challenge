package ca.jrvs.apps;

import java.util.Arrays;

/**
 * Find out if String t is an anagram of String s
 * note: Assume that all text are lower case
 * @return false if not an anagram and true if an anagram
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("tat", "tatat"));
    }

    public static boolean isAnagram(String t, String s){
        char[] char_t = t.toCharArray();
        char[] char_s = s.toCharArray();
        Arrays.sort(char_t);    //sorts the array
        Arrays.sort(char_s);    //sorts the array
        //sorted arrays are compared
        if (Arrays.equals(char_t, char_s))
            return true;
        return false;
    }
}
