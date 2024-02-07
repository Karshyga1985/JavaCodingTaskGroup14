package first_week_tasks;

import java.util.Scanner;

public class KhusanFirstWeekTasks {

    public static void main(String[] args) {
        System.out.println("========= 1 Task ===============");
        //solution1
        identify(5);
        identify(6);

        //solution2
        /*
        System.out.println(identify(6));
        System.out.println(identify(5));
         */

        System.out.println("========= 2 Task ===============");
        quotient(28, 4);
        quotient(27, 4);
        quotient(27, 0);

        System.out.println("========= 3 Task ===============");
        Finra();






    }

    // System.out.println("========= 1 Task ===============");
    // solution1 -Task 1
    public static void identify(int num){
        if(num % 2 == 0 ){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    //solution2 - Task 1
    /*
    public static String identify(int number){
        return (number % 2 == 0)? "Even" : "Odd";
    }
     */

    // System.out.println("========= 2 Task ===============");
    // solution1 - Task 2
    public static void quotient(int num1, int num2){
        int quotient = 0;
        if(num1 >= num2){
            while(num1 >= num2){
                num1 -= num2;
                quotient++;
            }
        }else {
            System.out.println("divisor " +num2+ " can't be greater than dividend "+ num1);
        }
        System.out.println(quotient);

        if(num1 > 0){
            System.out.println("remainder = " + num1);
        }

    }

    // System.out.println("========= 3 Task ===============");
    public static void Finra(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number up to 30: ");
        int number = input.nextInt();

        if(number >= 1 && number <= 30){

            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.print("FINRA ");
                }else if (i % 5 == 0){
                    System.out.print("RA ");
                } else if (i % 3 == 0){
                    System.out.print("FIN ");
                }else {
                    System.out.print(i + " ");
                }
            }
        }else {
            System.err.println("You entered: "+number + " It should be between 1 and 30");
        }
    }
}



/*
Task 1

Numbers -- odd & even
Write a method which can identifies given number is even or odd
Ex: identify(5) -> "Odd"
    identify(6) -> "Even"

Task 2

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator

Task 3

FINRA:
Write a method which prints out the numbers from  1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are
a multiple of 5, print "RA" instead of the number. For numbers which are a
multiple of both 3 and 5, print "FINRA" instead of the number.
 */