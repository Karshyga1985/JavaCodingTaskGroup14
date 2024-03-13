package mykola_solutions.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum {
    //2-Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        int[] arr = {200, 1, 2, 3, 4, 5, 6, 100};
        System.out.println(findMaxFromArr(arr));
        System.out.println(findMaxFromArr2(arr));
        System.out.println(findMaxFromArr3(arr));


    }

    public static int findMaxFromArr(int[] arr) {
        int max;
        if (arr.length == 0) {
            return 0;
        } else {
            max = arr[0];
            for (int each : arr) {
                if (max < each) {
                    max = each;
                }
            }
        }

        return max;
    }

    public static int findMaxFromArr2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int findMaxFromArr3(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        list.removeIf(p -> p != Collections.max(list));
        return list.get(0);
    }

}
