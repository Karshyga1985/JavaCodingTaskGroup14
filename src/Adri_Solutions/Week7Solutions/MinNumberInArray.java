package Adri_Solutions.Week7Solutions;

public class MinNumberInArray {

    public static void main(String[] args) {
        int [] arr = {3,45,6,7,8,9};
        System.out.println(minNumInArray(arr));
    }

    public static int minNumInArray(int[] arr){

        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minNum>arr[i]){
                minNum=arr[i];

            }
        }

        return minNum;
    }

}
/*
//    Write a method that can find the minimum number from an int Array
//    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
//     */