package Adri_Solutions.Week8Solutions;


import java.util.Arrays;

public class arrayNUniqueSumZero {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(5)));
        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(8)));
        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(3)));
        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(10)));
        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(101)));
        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(0)));
        System.out.println(Arrays.toString(arrayNUniqueSumZero.MakeArrayWithZeroSum(-2)));
    }

    public static int[] MakeArrayWithZeroSum(int N){
        if (N<=1 || N>=100){
            throw new IllegalArgumentException("N has to be greater than 1 and les sthan 100");
        }

        int[] result = new int[N];
        // Assign values from 1 to n-1 to the array elements
         for (int i = 1; i < N; ++i) {
                       result[i] = i;
         }

         // Calculate the sum of elements from 1 to n-1
        // To ensure the sum of the entire array is zero,
        // assign the negative of this sum to the first element
               result[0] = -(N * (N - 1) / 2);

               // Return the array with elements that sum to zero
        return result;

    }

/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
 */

}
