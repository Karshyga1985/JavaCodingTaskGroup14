package christine_solutions.week7;

import java.util.Arrays;

public class SortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static int[] sortDescending(int[] arr){


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i];

                if (arr[i] > arr[j]) {
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

        System.out.println("Arrays.toString(sortDescending(num)) = " + Arrays.toString(sortDescending(num)));
        System.out.println("Arrays.toString(sortDescending(num2)) = " + Arrays.toString(sortDescending(num2)));
        System.out.println("Arrays.toString(SortDescending(num3)) = " + Arrays.toString(sortDescending(num3)));


    }
}
