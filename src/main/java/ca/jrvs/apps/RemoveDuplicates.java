package ca.jrvs.apps;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Remove duplicates from a sorted array
 * @return array length
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New array lenght: " + removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr){
        if (arr.length == 0)
            return 0;
        Arrays.sort(arr);

        int[] removeDuplicate = new int[arr.length];
        int i = 0;
        removeDuplicate[i] = arr[0];

        for (int j = 1; j < arr.length; j++){
            if (removeDuplicate[i] != arr[j]){
                i++;
                removeDuplicate[i] = arr[j];
            }
        }
        int[] newArray = new int[i+1];
        for (int j = 0; j < i+1; j++)
            newArray[j] = removeDuplicate[j];
        System.out.println("New array: " + Arrays.toString(newArray));
        return newArray.length;
    }
}