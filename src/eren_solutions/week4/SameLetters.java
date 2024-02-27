package eren_solutions.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {


        System.out.println(isMadeOutOfSameLetters("abc", "cab"));
        System.out.println(isMadeOutOfSameLetters("racecar", "carrace"));
        System.out.println(isMadeOutOfSameLetters("arap", "para"));
        System.out.println(isMadeOutOfSameLetters("dog", "cat"));



   /*
       String_Task#2 --> Same letters
       Write a return method that check if a string is build out of the
       same letters as another string.

       Ex: same("abc", "cab"); -> true    , same("abc", "abb"); -> false:
   */
    }

        public static boolean isMadeOutOfSameLetters (String a, String b){

            if (a == null) { // In here we are checking the condition of if my string a or b is null.
                return b == null;
            } else if (b == null) {
                return false;
            }

            char[] left = a.toCharArray();
            char[] right = b.toCharArray();
            Arrays.sort(left);
            Arrays.sort(right);
            return Arrays.equals(left, right);

        }
    }
