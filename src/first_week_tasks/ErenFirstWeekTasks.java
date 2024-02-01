package first_week_tasks;

public class ErenFirstWeekTasks {

    public static void main(String[] args) {

        oddAndEvenNumber(5);
        oddAndEvenNumber(6);
        oddAndEvenNumber(7);


        divideWithoutOperator(40, 4);
        divideWithoutOperator(500, 25);
        divideWithoutOperator(145, 6);

        finra();

    }
    /*
    Task-1 ==> OddOrEven

    Write a method which can identify that if the given number is even or odd.

    Ex: identify(5) -> "Odd"
       identify(6) -> "Even"
    */

// Solution ==> Task 1 ==> Method of Odd Or Even

    public static void oddAndEvenNumber(int number) {
        if (number % 2 == 0 && number != 0) {
            System.out.println(number + ": is an even number.");
        } else if (number % 2 != 0) {
            System.out.println(number + ": is an odd number.");
        } else {
            System.out.println("Equals to zero");
        }
    }
/*
    Task-2 ==> Divide Without Division Operator

    Write a method that can divide two numbers without using division operator

     */

   // Solution ==> Task 2 ==>Method of Dividing Without Division Operator

    public static void divideWithoutOperator(int num1, int num2) {
        int count = 0;
        while (num1 >= num2) {// 10 >= 6 true
            num1 -= num2; // 10
            count++;
        }
        System.out.println(count + " remainder is " + num1);
    }
/*
    Task-3 ==> FINRA

Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are
a multiple of 5, print "RA" instead of the number. For numbers which are a
multiple of both 3 and 5, print "FINRA" instead of the number.


 */

    // Task-3 ==> Method Of FINRA
    public static void finra() {
        for (int i = 1; i <= 30; i++) {

            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i+" ");
            }
        }
    }
}

