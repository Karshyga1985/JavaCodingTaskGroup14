package bilgehan_solutions.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));
        System.out.println(frequencyOfCharacters2("AAABBCDD"));

    }

    public static String frequencyOfCharacters(String word) {
        String str = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char ch = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (ch == word.charAt(j)) {
                    count++;
                }

            }
            if (!(str.contains(ch + ""))) {
                str += "" + ch + count;
            }

        }
        return str;
    }

    public static String frequencyOfCharacters2(String word) {
        List<String> wordch = new ArrayList<>(Arrays.asList(word.split("")));
    String str = "";
        for (String each : wordch) {
           int frq=  Collections.frequency(wordch,each);
           if (!(str.contains(each))){
               str += each + frq;
           }
        }
         return str ;


    }
}
/*
        Write a return method that can find the frequency of
        characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */