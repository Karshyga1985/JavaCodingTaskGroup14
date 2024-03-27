package khusan_solutions.week4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(same("abc", "cba"));
        System.out.println(same("abc", "abb"));


    }

    public static boolean same(String str1, String str2){

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}


/*
        Write a return method that check if a string is build out of the
        same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:
*/