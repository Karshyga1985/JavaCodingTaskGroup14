package mykola_solutions.week9;

import java.util.Arrays;

public class ConcateTwoArr {
    /*
   Write a return method that can concate two arrays
     */

    public static int[] concatenateTwoArr(int[] arr1, int[] arr2){
        int[] result = Arrays.copyOf(arr1,arr1.length+arr2.length);
        for (int i = arr1.length, j =0 ; i < result.length;j++, i++) {
            result[i] = arr2[j];

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {10,11,12,13,14,15,16,17,18,19};
        System.out.println(Arrays.toString(concatenateTwoArr(arr1,arr2)));

    }

}
