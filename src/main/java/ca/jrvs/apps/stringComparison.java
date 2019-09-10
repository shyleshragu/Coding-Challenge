package ca.jrvs.apps;

/**
 * Comparing string int terms of reference and value
 * Result because of String pool
 */

public class stringComparison {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println("a == b :" + refEqual(a,b));
        System.out.println("a == c :" + refEqual(a,c));
        System.out.println("a.equals(b) : " + valEqual(a,b));
        System.out.println("a.equals(c) : " + valEqual(a,c));
    }

    private static String valEqual(String a, String b) {
        if (a.equals(b))
            return "yes";
        return "false";
    }

    private static String refEqual(String a, String b) {
        if (a == b)
            return "yes";
        return "no";
    }


}
