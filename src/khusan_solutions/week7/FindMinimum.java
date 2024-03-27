package khusan_solutions.week7;

import java.util.Arrays;

public class FindMinimum {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(minNumber(arr));

        System.out.println( minNumber(new int[]{2, 6, 34, 76, 23, 6, -12, 43, -6}));


    }
    public static int minNumber(int[] array){

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
}
