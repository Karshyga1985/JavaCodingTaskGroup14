package dilya_solutions.week2;

import java.util.Scanner;

public class ConsecutiveNums {

    /*
    Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2, 3, or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders   */
//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        //Test code by running and typing 30 into command line
        function(n);

    }
    public static void function(int n){
        for(int i = 1; i<=n; i++) {

            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                System.out.println("CodilityTestCoders");
            }
            else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println( "TestCoders");
            }
            else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println( "CodersCodility");
            }
            else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println ("CodilityTest");
            }
            else if (i % 5 == 0) {
                System.out.println ("Coders");
            }
            else if (i % 3 == 0) {
                System.out.println ("Test");
            }
            else if (i % 2 == 0) {
                System.out.println ("Codility");
            }
            else{
                System.out.println(i);
            }
        }
    }



}
