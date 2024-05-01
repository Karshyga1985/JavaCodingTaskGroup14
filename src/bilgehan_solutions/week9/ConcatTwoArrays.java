package bilgehan_solutions.week9;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
        System.out.println(Arrays.toString(concatArrays2(arr1, arr2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] arrConcat = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrConcat[i] = arr1[i];
            for (int j = arr1.length, k = 0; j < arrConcat.length; j++, k++) {
                arrConcat[j] = arr2[k];
            }
        }

        return arrConcat;
    }

    public static int[] concatArrays2(int[] arr1, int[] arr2) {
        int[] concat = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
                concat[j] = arr2[i] ;
        }
        return concat;
    }
}
 /*
    1) Array - Concat two arrays
    Write a return method that can concate two arrays
     */