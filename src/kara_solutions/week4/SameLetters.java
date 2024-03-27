package kara_solutions.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println("same(\"abc\", \"cab\") = " + same("abc", "cab"));
        System.out.println("same(\"fhghghg\", \"fghhggh\") = " + same("abc", "cab"));
        System.out.println("same(\"abcdfedd\", \"bcdaeffd\") = " + same("abc", "cab"));
    }

    public static boolean same(String str1, String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings character by character
        return Arrays.equals(charArray1, charArray2);
    }
}
/*
 Write a return method that check if a string is build out of the
        same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:
 */