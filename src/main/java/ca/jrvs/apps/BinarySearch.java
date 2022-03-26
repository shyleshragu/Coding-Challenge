package ca.jrvs.apps;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search
 * target in nums. If target exists, then return its index, otherwise return -1.
 */

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("The targets is located at " + bSearch(arr,6));
    }

    public static int bSearch(int[] arr, int target) {
        int pivot, left = 0, right = arr.length - 1;
        while (left <= right) {
            pivot = (left + right) / 2;
            if (arr[pivot] == target)
                return pivot;
            else {
                if (target < arr[pivot])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return -1;
    }
}
