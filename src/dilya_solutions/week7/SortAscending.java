package dilya_solutions.week7;

import java.util.Arrays;

public class SortAscending {
    public static int[] sortAsc(int[]arr){
            int num;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length ; j++) {
                    if(arr[i] > arr[j]){
                        num = arr[i];
                        arr[i] = arr[j];
                        arr[j] = num;
                    }
                }
            }
            return arr;
    }


    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortAsc(arr)));
    }
}
