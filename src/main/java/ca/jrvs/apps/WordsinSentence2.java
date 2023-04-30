import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WordsinSentence {

    public static void wordsinsentence(String input1) {
        //no need for exception because input is managed
        int count = 0;
        String inputreplaced = input1.replaceAll("[.:,]", "").toLowerCase();
        String[] inputarray = inputreplaced.split(" ");

        HashSet<String> noDuplicates = new HashSet<String>();

        for (int i = 0; i<inputarray.length; i++){
            noDuplicates.add(inputarray[i]);
        }

        for (String e : noDuplicates){
            for (int i = 0; i < inputarray.length; i++){
                if (e.equals(inputarray[i])){
                    count++;
                }
            }
            System.out.println(e + ": " + count);
            count = 0;
        }

    }

    public static void main(String[] args) throws Exception {
        String input = "XYZ Skin Tanning Lotion. Aloe Vera and Chamomile for smooth and soft skin. Free of Oxybenzone, Parabens, Phthalates, Fragrance, Animal Derived Ingredients and never tested on animals. This product does not contain a sunscreen and does not protect against sunburn. Repeated exposure of unprotected skin while tanning may increase the risk of skin aging, skin cancer and other harmful effects to the skin, even if you do not burn.";
        wordsinsentence(input);
    }
}
