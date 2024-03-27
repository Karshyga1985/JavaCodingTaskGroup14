package khusan_solutions.week7;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {
        int[] arr = {10, 9, 38, 75, 12, 45, 99};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println( Arrays.toString( ascArray( arr) ) );


    }

    public static int[] ascArray(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length ; j++) {

                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
}
