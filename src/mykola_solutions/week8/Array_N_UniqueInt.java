package mykola_solutions.week8;

import java.util.Arrays;

public class Array_N_UniqueInt {
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

    public static void main(String[] args) {
        System.out.println("returnArrWithUnique(4) = " + Arrays.toString(returnArrWithUnique(4)));
    }
    public static int[] returnArrWithUnique(int num){
        int[] result = new int[num];
        if (num == 2){
            result[0] = 1;
            result[1] = -1;
            return result;
        }

        int sum = 0;
        for (int i = 0; i < num-1; i++) {
            result[i] = i;
            sum +=i;
        }
        result[result.length-1] = -sum;
        return result;
    }


}
