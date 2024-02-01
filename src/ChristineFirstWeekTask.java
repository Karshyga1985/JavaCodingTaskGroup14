public class ChristineFirstWeekTask {

    /*
    Task 1

Numbers -- odd & even
Write a method which can identifies given number is even or odd
Ex: identify(5) -> "Odd"
    identify(6) -> "Even"
     */

    public static void identify(int num){

        if (num % 2 == 0){
            System.out.println("Even") ;
        }else {
            System.out.println("Odd") ;
        }
    }

    /*
    Task 2

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator

     */

    public static void divide(int num1, int num2){

        int divisibleBy = 0;

        //to make sure numbers are positive to get a positive answer
        if (num1 < 0){
            num1 = num1 * -1;
        }
        if (num2 < 0){
            num2 = num2 * -1;
        }

        while (num1 >= num2){
            num1 -= num2;
            ++divisibleBy;
        }

        System.out.println(divisibleBy);
    }

    /*
    Task 3

FINRA:
Write a method which prints out the numbers from  1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are
a multiple of 5, print "RA" instead of the number. For numbers which are a
multiple of both 3 and 5, print "FINRA" instead of the number.
     */



}
