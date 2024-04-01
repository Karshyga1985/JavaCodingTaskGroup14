package mykola_solutions.week4;

import java.lang.annotation.Target;
import java.util.Arrays;

public class SameLetters {
    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:



    public static boolean sameLetters(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }else {
            char[] char1 =str1.toCharArray();
            char[] char2 =str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);

            return Arrays.equals(char1,char2);
        }

    }






}
