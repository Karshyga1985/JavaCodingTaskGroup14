package eren_solutions.week12_extras;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

/*
Array -- permutation combinations

Given an array of 3 characters, print all permutation combinations from the given
characters
*/


    public static void printPermutations(char[] arr) {
        List<Character> current = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        generatePermutations(arr, current, used);
    }

    private static void generatePermutations(char[] arr, List<Character> current, boolean[] used) {
        if (current.size() == arr.length) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                current.add(arr[i]);
                used[i] = true;
                generatePermutations(arr, current, used);
                used[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c','d'};
        System.out.println("Permutation combinations:");
        printPermutations(arr);


/*

In this solution, I maintained a list (current) to keep track of the current permutation being constructed.
I also used a boolean array (used) to mark characters that have been used in the current permutation.

The generatePermutations method recursively generates permutations. At each step, it iterates over the characters in the array and selects the ones that haven't been used yet. It adds the selected character to the current permutation, marks it as used, recursively generates permutations, unmarks the character, and removes it from the current permutation (backtrack). This process continues until all permutations are generated.

*/

    }
}

