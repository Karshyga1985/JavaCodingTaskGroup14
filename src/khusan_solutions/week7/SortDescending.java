package khusan_solutions.week7;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};

        System.out.println( Arrays.toString( descArray( arr)));
    }

    public static int[] descArray(int[] array){

        int temp;
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length ; j++) {

                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
}
