package nazik_solutions.week1;

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextInt();

        boolean even = number % 2 == 0;  //when we divide by 2 remainder is 0 that means it's an even number , if not it's odd

        String OddOrEven = (even) ? "Even" : "Odd";

        System.out.println("The number you entered is an " + OddOrEven + " number.");

        input.close();

    }
}
/*
Task1:
Write a method which can identify given numbers is even or odd:
      identify(5) -> "Odd";
      identify(6) -> "Even"
 */