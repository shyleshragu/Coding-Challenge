package ca.jrvs.apps;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Remove an element from an array
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[][] arr = {
                {3,2,2,3},
                {0,1,2,2,3,0,4,2}
        };
        int[] val = {3,2};
        int i =0;
        for (int[] sent : arr){
            System.out.println("Original Array: "+ Arrays.toString(sent));
            System.out.println("\nNew array size: " + removeElement(sent,val[i]));
            i++;
        }
    }

    public static int removeElement(int[] arr, int val){
        if (arr.length == 0)
            return 0;
        int size = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != val){
                arr[size] = arr[i];
                size++;
            }
        }
        System.out.print("New Array:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + arr[i]);
        return size;
    }
}
