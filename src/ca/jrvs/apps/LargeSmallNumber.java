package ca.jrvs.apps;
/**
 * Largest and smallest integer in an unsorted integer array
 */

import java.util.Arrays;

public class LargeSmallNumber {
    public static void main(String[] args) {
        int[][] num = {
                {-20,34,21,-87,92},
                {122,-21,-40,70,40}
        };

        for (int[] input : num){
            int[] arr = largesmallNum(input);
            System.out.println();
            System.out.println("lowest number " + arr[0] + ": highest number " + arr[1]);
        }
    }

    public static int[] largesmallNum(int[] num){
        Arrays.sort(num);
        int[] small_large = {num[0], num[num.length-1]};
        return small_large;
    }
}
