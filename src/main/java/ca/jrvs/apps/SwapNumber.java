package ca.jrvs.apps;

/**
 * Swap numbers without using 3rd variable.
 */
public class SwapNumber {
    public static void main(String[] args) {
        swapNumber1(1,2);
        swapNumber2(1,2);
    }
    //Approach 1: using addtion and subtraction
    public static int[] swapNumber1(int a, int b){
        a = (a+b) - (b=a);
        System.out.println("a: "+ a + " b: " + b);
        return new int[]{a,b};
    }
    //Approach 2: using XOR
    public static int[] swapNumber2(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+ a + " b: " + b);
        return new int[]{a,b};
    }
}

