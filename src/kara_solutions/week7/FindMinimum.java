package kara_solutions.week7;

public class FindMinimum {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("minimumNumber(arr) = " + minimumNumber(arr));
    }

    public static int minimumNumber(int[] arr){
        int minNumber = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(minNumber > arr[i]){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

}
/*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */