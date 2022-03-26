package ca.jrvs.apps;

import java.util.Arrays;

/**
 * Find the duplicate number in an array containing n+1 integers
 * where each integer was between 1 and n (inclusive)
 * Assume: only noe duplicate number exists
 */
public class DuplicateNumber {
    public static void main(String[] args) {
        int[][] num = {
                {1,3,4,2,2},
                {3,1,3,4,2}
        };
        for (int[] numb : num)
            System.out.println(duplicateNum(numb));
    }

    public static int duplicateNum(int[] input){
        Arrays.sort(input);

        for (int i = 0; i < input.length-1; i++)
            if (input[i] == input[i+1])
                return input[i];
        return 0;
    }
}
