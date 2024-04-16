package mykola_solutions.week8;

import java.util.Arrays;

public class ArrayMoveZerosToEnd {
    /*
        Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do
    Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
    0]
     */

    public static void main(String[] args) {
        int[] testArr =  {1,0,2,0,3,0,4,0};

        System.out.println("moveZeros(testArr) = " + Arrays.toString(moveZeros(testArr)));


    }

    public static int[] moveZeros(int[] arr){
       int[] result = new int[arr.length];
        int count = 0;
        for (int eachNum : arr) {
            if(eachNum != 0){
                result[count] = eachNum;
                count++;
            }
        }
       return result;
    }








}
