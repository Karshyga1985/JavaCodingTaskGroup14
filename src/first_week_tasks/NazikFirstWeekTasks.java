package first_week_tasks;

import java.util.Scanner;

public class NazikFirstWeekTasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextInt();

        boolean even = number % 2 == 0;  //when we divide by 2 remainder is 0 that means it's an even number , if not it's odd

        String OddOrEven = (even) ? "Even" : "Odd";

        System.out.println("The number you entered is an " + OddOrEven + " number.");

        input.close();


    }

/*
Task1:
Write a method which can identify given numbers is even or odd:
      identify(5) -> "Odd";
      identify(6) -> "Even"
 */

    public static void divideWithoutOperator(int n1, int n2) {

        int count = 0;

        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        System.out.println( count + " with remainder " + n1);

    }

}
/* Task 2:
 Create am method that can divide two numbers without using division operator
*/

