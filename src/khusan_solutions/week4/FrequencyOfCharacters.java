package khusan_solutions.week4;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        System.out.println("FrequencyOfChars(AAABBCDD) = " + FrequencyOfChars(str));

    }

    public static String FrequencyOfChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(  !(result.contains(""+ str.charAt(i))) ){

                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result += str.charAt(i)+ "" +count;
            }

        }
        return result;
    }
}


/*
  Write a return method that can find the frequency of
        characters
        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/
