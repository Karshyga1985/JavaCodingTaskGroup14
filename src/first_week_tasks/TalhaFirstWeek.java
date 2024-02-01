package first_week_tasks;

public class TalhaFirstWeek {
    /*
 Numbers -- odd & even
Write a method which can identifies given number is even or odd
Ex: identify(5) -> "Odd"
 identify(6) -> "Even"
 */
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }


    /*
    Task 2

    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator
    */
    public static int division(int num1, int num2) {
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        return result;
    }

    public static void division2(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Can not divide by zero.");
        }
        int s = 1;
        if (num1 < 0) {
            s *= -1;
            num1 *= -1;
        }
        if (num2 < 0) {
            s *= -1;
            num2 *= -1;
        }
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        int a = 0;
        int t = 0;
        String result2 = ".";
        int z = num1 % num2;
        for (int i = 0; i < 9; i++) {
            z = z *= 10;
            while (z >= num2) {
                z -= num2;
                a++;

            }

            result2 += a;
            if (a >= 5) {
                t = a + 1;
            } else {
                t = a;
            }
            a = 0;
            z = z % num2;
        }


        result = result * s;
        System.out.println(result + result2 + t);

    }

    /*
Task 3

FINRA:
Write a method which prints out the numbers from  1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are
a multiple of 5, print "RA" instead of the number. For numbers which are a
multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void finra() {
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }


    }

}
