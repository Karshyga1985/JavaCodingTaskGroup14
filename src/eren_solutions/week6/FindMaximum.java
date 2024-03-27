package eren_solutions.week6;

public class FindMaximum {

    /*2- Array:

    Find Maximum:

    Write a method that can find the maximum number from an int Array.

    */



/*
Method: Using Recursion
Following are the steps to find the maximum element in the array.

Step 1: Make a recursive function with the name find max (int arr[, int n]).
Step 2: Basis: If (n==1), return arr[0].
Step 3: If not, give back max (arr[n-1], findMax(arr, n-1)

 */

    public static int findMax(int arr[], int n) {

        if (n == 1)
            return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));

    }

    public static void main(String args[]) {


        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;
        System.out.print(findMax(arr, n));


    }
}
/* How do I find the largest element in an array in Java?

Answer: You can find the largest element in an array in Java by iterating through the array and keeping track of the largest element seen so far. You can initialize a variable to the first element in the array, and then compare each subsequent element to this variable, updating the variable if a larger element is found.

*/


