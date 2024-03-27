package kara_solutions.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 13, 8, 9, 0};
        int[] arr1 = {33, 40, -3, 55, 80, 19, 70};
        System.out.println("sortAscending(arr) = " + Arrays.toString(sortAscending(arr)));
        System.out.println("sortArr(arr1) = " + Arrays.toString(sortArr(arr1)));
    }

    public static int[] sortAscending(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){//
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] sortArr(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i +1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
 /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */