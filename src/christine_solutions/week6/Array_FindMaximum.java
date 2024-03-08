package christine_solutions.week6;

import java.lang.reflect.Array;

public class Array_FindMaximum {

    public static void main(String[] args) {

        int[] num = {1, 24, 5, -6, 8};
        int[] num2 = {-1, 36, 0, -89, 102};
        int[] num3 = {-1, -23, -111, -54};

        System.out.println("findMax(num) = " + findMax(num));
        System.out.println("findMax(num2) = " + findMax(num2));
        System.out.println("findMax(num3) = " + findMax(num3));


    }



    public static int findMax(int[] nums){

        int max = nums[0];

        for (int num : nums) {
            if (num > max){
                max = num;
            }
        }

        return max;
    }
}




/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
