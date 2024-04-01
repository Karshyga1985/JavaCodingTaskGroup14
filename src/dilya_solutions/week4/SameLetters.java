package dilya_solutions.week4;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {
    /*
        Write a return method that check if a string is build out of the
        same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:" );
        String a = sc.nextLine();
        System.out.println("Enter second word:");
        String b = sc.nextLine();

        System.out.println(sameLetters(a, b));
    }
    public static boolean sameLetters(String a, String b) {
        Scanner sc = new Scanner(System.in);
        while(a.isBlank()&&b.isBlank()){
            System.err.println("Values cannot be blank, try again:");
            a = sc.nextLine();
            b = sc.nextLine();
        }
        char[] aa = a.toCharArray(), bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        return Arrays.equals(aa, bb);


    }
}
