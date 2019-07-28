package ca.jrvs.apps;
/**
 * Find whether a string contains only digits
 */
public class StringdigitCheck {
    public static void main(String[] args) {
        String[] text = {"12345678","123.45678","123/45678","123A45678","abcde"};

        for (String input : text)
            System.out.println(isSdigit(input));
    }

    /**
     * Compares the characters of the text to ascii table and checks if they are digits
     * @param text
     * @return false if the ascii value of character was not in the range of numbers
     */
    public static boolean isSdigit(String text){
        char[] charaters = text.toCharArray();
        for (char asciiText : charaters)
            if ((int)asciiText < 48 || (int)asciiText > 57)
                return false;
        return true;
    }
}
