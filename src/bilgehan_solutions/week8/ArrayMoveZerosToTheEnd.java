package bilgehan_solutions.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {0,8,9,5,0,7,0,3,0,4,7,0,9,8} ;
        System.out.println(Arrays.toString(moveZeroes(arr)));
        System.out.println(Arrays.toString(moveZeroes1(arr)));
        System.out.println(Arrays.toString(duplicate(arr)));
    }

    public static int[] moveZeroes(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length -1  ; j++) {
                if (arr[j]==0 ) {
                    arr[j]=arr[j+1];
                    arr[j+1]=0;
                }
            }
        }

        return arr;
    }

    public static int[] moveZeroes1(int[] arr) {
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.removeIf(p-> p==0) ;
        int n= list.size() - arr.length ;

        for (int i = 0; i < n; i++) {
            list.add(0);
        }
        Integer[] arr1 = list.toArray(new Integer[0]);
        for (int i = 0; i < arr1.length; i++) {
            arr[i]= arr1[i];
        }
        return arr;
    }
    public static int[] duplicate(int [] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                count ++ ;
                }
            }
            if (count ==1) {
                list.add(arr[i]);
            }
        }

        Integer[] arr1 = list.toArray(new Integer[0]);
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        return arr;


    }
}
    /*
        Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do
    Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
    0]
     */