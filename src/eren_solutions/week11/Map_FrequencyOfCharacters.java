package eren_solutions.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    /*

    Write a method that prints the frequency of each character from a String.
Example: input => "hello world"
         output => {h=1, e=1, l=3, o=2,  =1, w=1, r=1, d=1}

    */

    public static void main(String[] args) {

        frequencyOfCharacter("banana apple pie");
    }

    public static void frequencyOfCharacter(String str) {

        Map<Character, Integer> counter = new LinkedHashMap<>(); // key - each char and the value - is the frequency

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (!counter.containsKey(eachChar)) {
                counter.put(eachChar, 0);
            }

            counter.put(eachChar, counter.get(eachChar) + 1);

        }

        System.out.println(counter);

    }

}
