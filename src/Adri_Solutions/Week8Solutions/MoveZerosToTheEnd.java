package Adri_Solutions.Week8Solutions;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        int[] array = {1,0,7,0,0,8,4,7};
        System.out.println(Arrays.toString(moveZerosToTheEnd(array)));
    }
    public static int[] moveZerosToTheEnd(int[] array){


            int another_array[] = new int[array.length];
            int j=0;
            for(int i=0; i<array.length;i++){
                if(array[i]!=0){
                    another_array[j]=array[i];
                    j++;
                }
            }
      return another_array;
    }

}



    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0
     */

