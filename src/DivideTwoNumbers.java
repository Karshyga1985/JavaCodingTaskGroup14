import java.util.Scanner;

public class DivideTwoNumbers { // (Without Divope)



    public static void main(String args[]) { //main method

        int  result = 0;

        Scanner scan = new Scanner(System.in); // scanner object creation

     //  create a scanner instance for receiving input from the user-input from keyboard.

        System.out.print("Enter the value to number1: "); // User input -1
        int number1 = (scan.nextInt());
        System.out.print("Enter the value to number2: ");// User input-2
        int number2 = (scan.nextInt());

        while (number1 >= number2 ) {

             number1 -= number2;
            result++;
        }

        scan.close();

        System.out.println("Division is equal to: " + result);

    }
}
/*
     Write a method that can divide two numbers without using division operator

 */


