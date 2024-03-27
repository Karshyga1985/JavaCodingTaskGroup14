package kara_solutions.week6;

public class FindMaximum {

    public static void main(String[] args) {
        int[] arr = {0, 12, 54, 23, -8, 9, 85, 100, 125, 133, 14};
        System.out.println("findMax(arr) = " + findMax(arr));

        int[] arr1 = {500, 512, 55, 83, -8, 566, 1000, 100, 125, 133, 2000};
        System.out.println("findMax(arr1) = " + findMax(arr1));

    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
/*
2-Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */