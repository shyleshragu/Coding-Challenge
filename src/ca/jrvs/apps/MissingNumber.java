package ca.jrvs.apps;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Find the number that is missing between 0...n
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[][] num = {
                {3,0,1},
                {9,6,4,2,3,5,7,0,1},
                {0,1,2,3,4,5}
        };

        for (int[] singleArray : num){
            System.out.print("missing -> ");
            missingNum(singleArray);
        }
    }

    public static void missingNum(int[] arr){
        Arrays.sort(arr);
        Hashtable<Integer, Integer> missingArr = new Hashtable<>();

        for (int i = 0; i < arr.length; i++){
            if (i != arr[i])
                missingArr.put(i, i);
        }

        if (missingArr.size() == 0)
            System.out.println("No missing numbers present");
        else
            System.out.println(missingArr.keySet());
    }
}
