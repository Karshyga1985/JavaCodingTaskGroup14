package dilya_solutions.week8;

import java.util.Arrays;

public class Array_MoveZerosToEnd {
    public static void moveZeros(int[]arr){
        int temp=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[temp] = arr[i];
                temp++;
            }
        }
        while(temp < arr.length){
            arr[temp] = 0;
            temp++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static String moveZeros2(int[]arr){
        int temp=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[temp] = arr[i];
                temp++;
            }
        }
        while(temp < arr.length){
            arr[temp] = 0;
            temp++;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[]arr={1,2,0,5,0,6,4,0,9};
        moveZeros(arr);
        System.out.println(moveZeros2(arr));
    }
}
