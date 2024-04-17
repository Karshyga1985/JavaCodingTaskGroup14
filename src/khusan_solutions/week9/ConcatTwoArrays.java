package khusan_solutions.week9;

import java.util.Arrays;

public class ConcatTwoArrays {
/*
    Add elements to Array in JAVA:
        - By creating a larger size array than arr.
        - By using ArrayList
        - By shifting the element to adjust the size of arr.

 */


    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6,7};
        System.out.println( Arrays.toString( concatTwoArrays(array1, array2) ) );

        //System.out.println(Arrays.toString(bigArray));
    }

    public static int[] concatTwoArrays(int[] array1, int[] array2){

        int[] bigArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            bigArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            bigArray[array1.length+i] = array2[i];
        }

        return bigArray;
    }
}


/*
    1) Array - Concat two arrays
    Write a return method that can concat two arrays
     */