package ca.jrvs.apps;

/**
 * Create a method that will print natural number (in String) with comma(s)
 * e.g.
 * input (String): "12345"    output: "12,345"
 * input:          "1234567"   output: "1,234,567
 * input:          "-123"           output "-123"
 * Hint: use recursion
 */
public class stringComma {

    public static void main(String[] args) {
        String[] in = {"12345", "1234567", "-123"};

        for (String a : in)
            System.out.println("Natural number: " + sCommaMethod(a));
    }

    private static String sCommaMethod(String input) {
            if(input == null || input.length() <= 3){
                return input;
            }
            String firstPart = sCommaMethod(input.substring(0, input.length() - 3));
            String lastThree = input.substring(input.length() - 3, input.length());
            if("-".equals(firstPart) || "+".equals(firstPart)){
                return firstPart + lastThree;
            }
            return firstPart + "," + lastThree;
    }
}

