package dilya_solutions.week9;

import java.util.Arrays;

public class Array_ConcatArrays {
    //Write a return method that concatenates two arrays


    public static String concatArr(int[]arr1, int[]arr2){
        int[] result = new int[arr1.length+arr2.length];
        int n=0;
        for(int each:arr1){
            result[n++]=each;
        }for(int each:arr2){
            result[n++]=each;
        }
        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        int[]a={1,2,3}, b={4,5,6};
        System.out.println(concatArr(a,b));
    }
}
