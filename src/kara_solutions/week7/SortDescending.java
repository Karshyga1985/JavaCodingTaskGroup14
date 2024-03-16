package kara_solutions.week7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        int[] arr1 = {100, 80, -56, 75, 55, 13, 87, 901};
        System.out.println("sortDescending(arr) = " + Arrays.toString(sortDescending(arr)));
        System.out.println("sortDescending(arr1) = " + Arrays.toString(sortDescending(arr1)));
    }

    public static int[] sortDescending(int [] arr){

        for (int i = 0; i < arr.length - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
/*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */