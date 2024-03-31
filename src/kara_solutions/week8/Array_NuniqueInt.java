package kara_solutions.week8;

import java.util.Random;

public class Array_NuniqueInt {

    public static void main(String[] args) {
        int N = 5; // Adjust N as needed
        int[] result = generateArray(N);

        System.out.print("[");
        for (int i = 0; i < N; i++) {
            System.out.print(result[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static int[] generateArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N must be greater than 1 and less than 100");
        }

        int[] array = new int[N];
        Random random = new Random();
        // Generate N - 1 random integers
        for (int i = 0; i < N - 1; i++) {
            array[i] = random.nextInt(200) - 100; // Generate random integer in range [-100, 99]
        }
        // Calculate the sum of the generated integers
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        // Calculate the last integer needed to make the sum zero
        array[N - 1] = -sum;
        return array;
    }
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