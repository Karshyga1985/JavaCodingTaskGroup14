package Adri_Solutions.Week4Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Same_Letters {

    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static boolean SameLettersStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        List<String> word1ch = new ArrayList<>(Arrays.asList(word1.split("")));
        List<String> word2ch = new ArrayList<>(Arrays.asList(word2.split("")));

        for (String each1 : word1ch) {
            for (int j = 0; j < word2ch.size(); j++) {
                word2ch.removeIf(p -> p.equals(each1));
            }
        }
        if (word2ch.size() == 0) {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {

        System.out.println(SameLettersStrings("abbc", "abcd"));
        System.out.println(SameLettersStrings("tod", "dot"));
        System.out.println(SameLettersStrings("fair", "hair"));


    }
}
