package ca.jrvs.apps;

import java.util.Hashtable;

/**
 * Return indices of the two numbers such that they add
 * up to a specific target
 * Assume: each input would have exactly one solution and
 * not allowed to use the same element twice.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(num, target));
    }

    public static String twoSum(int[] nums, int target){
        Hashtable<Integer, Integer> num = new Hashtable<>();
        int complement;
        for (int i = 0; i< nums.length; i++)
            num.put(nums[i],i);

        for (int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if (num.containsKey(complement))
                return nums[i]+" + "+complement+" = " +target;
        }
        throw new IllegalArgumentException("No two numbers can add up to the target");
    }
}
