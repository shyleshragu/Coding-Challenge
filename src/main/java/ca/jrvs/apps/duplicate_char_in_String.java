package ca.jrvs.apps;
/**
 * Find duplicate characters in a string
 * Note: Write O(n) solution
 */

import java.util.Hashtable;

public class duplicate_char_in_String {

    public static void main(String[] args) {
        System.out.println(duplicateCharFromString("Programming"));
        System.out.println(duplicateCharFromString("Combination"));
        System.out.println(duplicateCharFromString("Java"));
    }

    public static Hashtable duplicateCharFromString(String word) {
        char[] characters = word.toCharArray();

        //hashmap with characters that increments each time they appear
        Hashtable<Character, Integer> charMap = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer> output = new Hashtable<Character, Integer>();

        for (Character character : characters){
            if (charMap.containsKey(character)){
                charMap.put(character, charMap.get(character)+1);
                if (output.get(character) == null)
                    output.put(character, 2);
                else
                    output.put(character, output.get(character)+1);
            }
            else {
               charMap.put(character, 1);
            }
        }

        return output;
    }
}
