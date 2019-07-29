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
    public static void swapNumber1(int a, int b){
        a = (a+b) - (b=a);
        System.out.println("a: "+ a + " b: " + b);
    }
    //Approach 2: using XOR
    public static void swapNumber2(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+ a + " b: " + b);
    }
}

