package ca.jrvs.apps;

/**
 * Find whether the input is a power of 2.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int[] input = {0,1,2,3,4,5,6,16,218};

        for (int sent : input) {
            System.out.println(sent + ">> Approach 1: " + poweroftwo(sent));
            System.out.println(sent + ">> Approach 2: " + poweroftwo2(sent));
        }

    }

    public static boolean poweroftwo(int value){
        if (value <= 0)
            return false;

        while (value > 1) {
            if (value % 2 != 0)
                return false;
            value = value/2;
        }
        return true;
    }

    public static boolean poweroftwo2(int value){
        return (value > 0) && ((value & (value - 1)) == 0);
    }
}
