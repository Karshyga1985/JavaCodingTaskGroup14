package Adri_Solutions.Week7Solutions;

import java.util.Arrays;

public class SortArrayAscendingOrder {

    public static void main(String[] args) {
        int [] arr = {1,4,7,5,3,9,2,4,6};
        System.out.println(Arrays.toString(sortedAscending(arr)));
    }

    public static int[] sortedAscending(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]> arr[j]){

                   int temp= arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;

                }
            }
            
        }

        return  arr;

    }

}
/*
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//    Ex: int[] arr = {10, 9, 8, 7};
//    arr = Sort(arr); ==>{ 7, 8, 9, 10};
//     */