package mykola_solutions.week7;

import java.util.Arrays;

public class SortAscendingAdnDescending {

    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static int[] sortAscending(int[] arr){

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int temp;
                if (arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        return arr;

    }







    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static int[] sortDescending(int[] arr){

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int temp;
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        return arr;

    }







    public static void main(String[] args) {

        int[] arr = {200, 1, 2, 3, 4, 5, -6, 100};
        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr)));

    }

}
