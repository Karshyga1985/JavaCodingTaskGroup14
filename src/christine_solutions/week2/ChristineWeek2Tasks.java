package christine_solutions.week2;

import java.util.Scanner;

public class ChristineWeek2Tasks {

    public static void main(String[] args) {

             /*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2, 3, or 5, it should be replaced by a concatenation
    of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2
    and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2, 3 and 5, should be replaced
    by CodilityTestCoders.

    For example, here is the output for N = 24:
    1
    Codility
    Test
    Codility
    Coders
    CodilityTest
    7
    Codility
    Test
    CodilityCoders
    11
    CodilityTest
    13
    Codility
    TestCoders
    Codility
    17
     */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a positive number for CodilityTestCoders: ");
        int n = input.nextInt();
        input.close();

        for(int i = 1 ; i <= n ; i++){
            if( i % 5 == 0 && i % 3 == 0 && i % 2 == 0){
                System.out.println("CodilityTestCoders");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("TestCoders");
            } else if ( i % 5 == 0 && i % 2 == 0 ) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 2 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codilty");
            }else {
                System.out.println(i);
            }
        }

        System.out.println("--------------------------------------------------------------------------------------");


        divisibleBy3And5And15(); // decided to turn it into a method since it was asking for 1 - 100

        System.out.println("--------------------------------------------------------------------------------------");

        swapNumbers(3,4);



    }
    /*
    Write a program that can print the numbers between 1 - 100 that can be divisible by 3, 5, and 15.
       if the number can be divisible by 3, 5, and 15, then it should only be displayed in DivisibelBy15' section.
       if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section.
       if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy15' section.
    ex:
       OutPut:
          Divisible By 15: 15 30 45 60 75 90
          Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
          Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */

    public static void divisibleBy3And5And15(){

        String divisibleBy15 = "Divisible By 15: ",
                divisibleBy5 = "Divisible By 5: ",
                divisibleBy3 = "Divisible By 3: ";

        for (int i = 1; i <=100; i ++){
            if(i % 15 == 0 && i % 5 == 0 && i % 3 == 0 ){
                divisibleBy15 += i + " ";
            }else if(i % 5 == 0){
                divisibleBy5 += i + " ";
            } else if(i % 3 == 0){
                divisibleBy3 += i + " ";
            }
        }

        System.out.println(divisibleBy15 + "\n" + divisibleBy5 + "\n" + divisibleBy3);
    }

    /*
    Swap two variable' values without using a third variable
     */

    public static void swapNumbers(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
