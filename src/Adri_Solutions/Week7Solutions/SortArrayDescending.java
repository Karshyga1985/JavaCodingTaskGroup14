package Adri_Solutions.Week7Solutions;

import java.util.Arrays;

public class SortArrayDescending {

    public static void main(String[] args) {
        int[] arr = {9,2,4,68,4,8,8,42,7,4};
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
