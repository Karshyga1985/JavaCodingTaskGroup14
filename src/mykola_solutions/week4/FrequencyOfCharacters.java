package mykola_solutions.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String frequencyOfChars(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (!result.contains(str.charAt(i)+"")){
                result += ""+ str.charAt(i) + Collections.frequency(Arrays.asList(str.split("")),str.charAt(i)+"");
            }

        }
        return result;
    }

    public static String frequencyOfChars2(String str){
        String result = "";
        for (char eachChar : str.toCharArray()) {

            if (!result.contains(eachChar+"")){
                int count = 0;
                for (char charToCount : str.toCharArray()) {
                    if (charToCount == eachChar){
                        count++;
                    }

                }
                result += "" + eachChar + count;
            }
        }
        return result;

    }

}
