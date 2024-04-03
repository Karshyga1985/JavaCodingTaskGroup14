package khusan_solutions.week8;

import java.util.Arrays;

public class NUniqueIntegers_Array {

    public static void main(String[] args) {

        int N = 11;

//        System.out.println(Arrays.toString(result));

        System.out.println( Arrays.toString( sumZero(5) ) );
    }

    public static int[] sumZero(int N){

        int[] result = new int[N];

        for (int i = 1; i < N; i++) {
            result[i] = i;
        }

        result[0] = -(N*(N-1)/2);

        return result;
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