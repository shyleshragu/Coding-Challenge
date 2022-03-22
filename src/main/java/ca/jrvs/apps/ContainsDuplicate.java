package ca.jrvs.apps;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Find if an array contains any duplicates
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,1},
                {1,2,3,4},
                {1,1,1,1,3,3,4,3,2,4,2}
        };

        for (int[] sent : arr)
            System.out.println(isDuplicate(sent));
    }

    public static boolean isDuplicate(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] == arr[i+1])
                return true;
        }

        return false;
    }
}
