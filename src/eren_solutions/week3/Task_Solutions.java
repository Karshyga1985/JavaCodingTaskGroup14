package eren_solutions.week3;

public class Task_Solutions {

    public static void main(String[] args) {

    /*
            1. Numbers -- Prime Number

             Prime Number:The Prime number is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1.

            ===>(e.g. 2, 3, 5, 7, 11).

            Write a method that can check if a number is prime or not.
    */


        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(19));
        System.out.println(isPrime(35));
        System.out.println(isPrime(125));


        System.out.println(reverseInteger(-567));
        System.out.println(reverseInteger(-1453));
        System.out.println(reverseInteger(-245));
        System.out.println(reverseInteger(-1235));
        System.out.println(reverseInteger(-345));

    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

            /* 2. Numbers -- Reverse Negative Number

                 Write a return method that can reverse negative number and return it as int.
             */

        public static int reverseInteger(int number) {

            boolean isNegative = number < 0 ? true : false;
            if (isNegative) {
                number = number * -1;
            }
            int reverse = 0;
            int lastDigit = 0;

            while (number >= 1) {
                lastDigit = number % 10; // gives you last digit
                reverse = reverse * 10 + lastDigit;
                number = number / 10; // get rid of last digit
            }

            return isNegative == true ? reverse * -1 : reverse;


        }

        /*NOTE: When you divide a number by 10, you get rid of the last digit, for example, 211/10 will give you 21,and 21/10 will give you 2, so you got rid of the last 2 digits by dividing your number by 10 twice.

          Similarly, you can use the number modulo 10 to get the last digit of the number, for example,221%10 will return 1,which is the last digit and 22%10 will return 2, which is the last digit of 22.You can apply this logic until you proceed to the last digit.
          */
    }

