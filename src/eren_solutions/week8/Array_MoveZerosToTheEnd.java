package eren_solutions.week8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

/*
Array - Move Zeros to the End

Write a method that can move all the zeros to last indexes of the array

(Do Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0,0]

 */

    public static void moveZerosToEnd(int[] nums) {
        int index = 0; // Index to place non-zero elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If a current element is non-zero, move it to the current index
                nums[index++] = nums[i];
            }
        }

        // Fill the rest of the array with zeros from index onwards
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 5};
        System.out.println("Original array: " + Arrays.toString(nums));

        moveZerosToEnd(nums);

        System.out.println("Array after moving zeros to end: " + Arrays.toString(nums));

    }
}

