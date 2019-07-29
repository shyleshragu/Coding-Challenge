package ca.jrvs.apps;
/**
 * Determine whether a string is a palindrome
 * Note: Use recursion
 * Note: Only alphanumeric characters and ignoring cases
 * Note: Empty string is a valid palindrome
 */

public class PalindromeValid_recursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("     "));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("ama"));
    }

    public static boolean isPalindrome(String text){
        String reverseText = reversion(text);
        if (text.equals(reverseText))
            return true;
        return false;
    }

    public static String reversion(String text){
        if (text == null || text.isBlank() || text.isEmpty())
            return "";
        String revText = reversion(text.substring(0, text.length())) +text.charAt(text.length()-1);
        return revText;
    }
}
