package christine_solutions.week7;

import java.util.Arrays;

public class SortAscending {
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static int[] sort(int[] arr){


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i];

                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] num = {1, 24, 5, -6, 8};
        int[] num2 = {-1, 36, 0, -89, 102};
        int[] num3 = {-1, -23, -111, -54};

        System.out.println("sort(num) = " + Arrays.toString(sort(num)));
        System.out.println("sort(num2) = " + Arrays.toString(sort(num2)));
        System.out.println("sort(num3) = " + Arrays.toString(sort(num3)));
    }

}
