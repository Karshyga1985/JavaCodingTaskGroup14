package dilya_solutions.week6;

import java.util.Arrays;

public class FindMaximum {
    public static void findMax1(int[]arr){
        Arrays.sort(arr);
        System.out.println("Max: " + arr[arr.length-1]);
    }

    public static int findmax1_0(int[]arr){
        int max=0;
        for (int each : arr) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr={1,4,6,9,4,6,8,-77,1999, 1000056};
        findMax1(arr);
        System.out.println("Max: " +findmax1_0(arr));
    }
}
