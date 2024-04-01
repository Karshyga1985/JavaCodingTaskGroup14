package christine_solutions.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static void main(String[] args) {
        System.out.println("sameLetters(\"abc\", \"cab\") = " + sameLetters("abc", "cab"));
        System.out.println("sameLetters(\"kayak\", \"yaakk\") = " + sameLetters("kayak", "yaakk"));
        System.out.println("sameLetters(\"robot\", \"boots\") = " + sameLetters("robot", "boots"));
    }

    public static boolean sameLetters(String str1, String str2){

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);


    }



}
