package ca.jrvs.apps;
/**
 * Determine whether a string is a palindrome
 * Note: Only alphanumeric characters and ignoring cases
 * Note: Empty string is a valid palindrome
 */

public class PalindromeValid {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("     "));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("ama"));
    }

    public static boolean isPalindrome(String sent){
        String compareWord="";

        //if message is null, it is a palindrome
        if (sent == null || sent.isEmpty() || sent.isBlank())
            return true;
        sent = sent.toLowerCase();
        String nospaceSent = sent.replaceAll("\\ ","");
        String[] words = nospaceSent.split("\\W+");

        for (int i = 0; i < words.length; i++){
            for (int j = words[i].length()-1; j >= 0; j--){
                compareWord += words[i].charAt(j);
            }
            //if the reversed word is contained in string, it is a palindrome
            if (nospaceSent.contains(compareWord))
                return true;
        }
        return false;
    }
}
