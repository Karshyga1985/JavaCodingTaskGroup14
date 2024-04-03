package eren_solutions.week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Array_UniqueIntegersOfSumZero {


/*Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3, one of the possible answers is [-1,0,1] (but there are many more
correct answers).*/

        public static void main(String[] args) {
            int N = 6;
            int[] result = UniqueIntegersSumZero.generateArrayWithZeroSum(N);

            System.out.println(Arrays.toString(result));

        }


        public static class UniqueIntegersSumZero {

            public static int[] generateArrayWithZeroSum(int N) {
                if (N <= 1 || N >= 100) {
                    throw new IllegalArgumentException("N should be greater than 1 and less than 100");
                }

                Set<Integer> uniqueIntegers = new HashSet<>();
                Random random = new Random();

                // Generate N-1 unique integers randomly
                while (uniqueIntegers.size() < N - 1) {
                    uniqueIntegers.add(random.nextInt(201) - 100); // Generate integers between -100 and 100
                }

                int[] result = new int[N];
                int index = 0;
                int sum = 0;

                // Copy the unique integers into the result array
                for (int num : uniqueIntegers) {
                    result[index++] = num;
                    sum += num;
                }

                // Calculate the last integer to ensure the sum is 0
                result[index] = -sum;

                return result;
            }

        }

    }

