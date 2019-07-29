package ca.jrvs.apps;

/**
 * Check if input integer is even or odd
 */
public class EverOrOdd {
    public static void main(String[] args) {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 16, 218};

        for (int sent : input) {
            System.out.println(sent + ">> Approach 1: " + evenoddcheck1(sent));
            System.out.println(sent + ">> Approach 2: " + evenoddcheck2(sent));
        }
    }
    //modulus approach
    public static String evenoddcheck2(int sent) {
        if (sent == 0)
            return "0 is neither even or odd";
        if (sent%2 == 0)
            return "Even";
        return "Odd";
    }

    //bitwise approach
    public static String evenoddcheck1(int value){
        if (value == 0)
            return "0 is neither even or odd";
        if ((value & 1) == 0)
            return "Even";
        return "Odd";
    }


}
