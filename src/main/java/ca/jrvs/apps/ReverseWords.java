package ca.jrvs.apps;

import java.util.Arrays;

/**
 * Reverse a String word by word
 */
public class ReverseWords {
    public static void main(String[] args) {
        String[] words = {
                "the sky is blue",
                "hello world!",
                "a good example",
                " "
        };

        for (String word : words){
            System.out.println("Input: " + word);
            System.out.println("Output: " + reverseWords(word));
        }
    }

    public static String reverseWords(String sentence){
        String[] words = sentence.split("\\s");
        String[] reversewords = new String[words.length];
        int i = 0;
        for (int j = words.length-1; j >= 0; j--){
            reversewords[i] = words[j];
            i++;
        }
        String output = "";
        for (String newword : reversewords)
            output += newword+" ";
        return output;
    }

}
