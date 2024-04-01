package eren_solutions.week7;

import java.util.Arrays;

public class SortArrayDescending {

    public static void main(String[] args) {
        int[] arr = {20,40,60,80,100,120,200};
        System.out.println(Arrays.toString(sortArrayDescending(arr)));

    }

    public static int[] sortArrayDescending(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] < arr[j]){

                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }

            }

        }
        return arr;
    }
}
/*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */