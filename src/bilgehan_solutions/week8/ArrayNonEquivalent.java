package bilgehan_solutions.week8;

import java.util.Arrays;

public class ArrayNonEquivalent {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(nonEquivalent(5)));
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

    public static int[] nonEquivalent(int n) {
        if(n<=1 || n>=100) {
            throw new IllegalArgumentException("N must be bigger than 1 and smaller than 100");
            }
        int[] arr = new int[n];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        arr[0] = -((n-1)*n /2) ;
        return arr;
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