package christine_solutions.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {


        System.out.println("frequencyOfChars(\"aabbccddddd\") = " + frequencyOfChars("aabbccddddd"));
        System.out.println("frequencyOfChars(\"aaaaeeeedddddfff\") = " + frequencyOfChars("aaaaeeeedddddfff"));


    }

    public static String frequencyOfChars(String str){

        String result = "";


        for (int j = 0; j < str.length(); j++){

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i <str.length(); i++){

                if (str.charAt(i) == ch){
                    count++;
                }

            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch + "" + count;

        }

        return result;
    }

    



}
