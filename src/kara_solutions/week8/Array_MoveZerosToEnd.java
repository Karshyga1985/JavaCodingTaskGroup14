package kara_solutions.week8;

import java.util.Arrays;

public class Array_MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {0, 2, 8, 0, 4, 3, 0, 5, 0};
        System.out.println("moveZerosToEnd(array) = " + Arrays.toString(moveZerosToEnd(array)));
    }

    public static int[] moveZerosToEnd(int[] array){
        int index = 0;//0->1->2->3->4->
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){// 2, 8, 4, 3, 5,
                array[index] = array[i];
                index++;
            }
        }
        // adding 0s to array
        while(index < array.length){
            array[index] = 0;
            index++;
        }
        return array;
    }
}
 /*
        Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do
    Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
    0]
     */