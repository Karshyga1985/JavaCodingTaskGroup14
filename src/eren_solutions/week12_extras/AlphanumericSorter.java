package eren_solutions.week12_extras;

import java.util.Arrays;

public class AlphanumericSorter {

/*

String -- Sort Letters and Numbers from alphanumeric String

Given an alphanumeric String, we need to split the string into substrings of consecutive
letters or numbers, sort the individual string and append them back together.
Ex:
Input: "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"

*/

        public static String sortAlphanumeric(String input) {

            char[] chars = input.toCharArray();
            char[] letters = new char[chars.length];
            char[] numbers = new char[chars.length];
            int lettersIndex = 0;
            int numbersIndex = 0;

            for (char eachChar : chars) {
                if (Character.isLetter(eachChar)) {
                    letters[lettersIndex++] = eachChar;
                } else if (Character.isDigit(eachChar)) {
                    numbers[numbersIndex++] = eachChar;
                }
            }

            Arrays.sort(letters, 0, lettersIndex);
            Arrays.sort(numbers, 0, numbersIndex);

            return new String(letters, 0, lettersIndex) + new String(numbers, 0, numbersIndex);
        }

        public static void main(String[] args) {
            String input = "DC501GCCCA098911";
            String output = sortAlphanumeric(input);
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);


            /*
            This version removes the unnecessary StringBuilder usage and directly concatenates the sorted letters and numbers to form the final sorted string.
          */

        }
    }
