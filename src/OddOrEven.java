import java.util.Scanner;

public class OddOrEven {

        public static void main(String[] args) {


            OddOrEven(5);

            OddOrEven(6);


            System.out.println("----------------------------------------");

            // SOLUTION-1=> CREATING WITH DYNAMIC SCANNER OBJECT INTERACTION WITH USER

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your number: ");

            int number = input.nextInt();

            String oddOrEven = (number % 2 == 0) ? "Even number " : " Odd number";

            System.out.println("The number you choose is an: " + oddOrEven);

            input.close();


            System.out.println("-----------------------------------------");

            // SOLUTION-2 CHECKING IT WITH BOOLEAN(true or false)LOGIC
            int number1 = 50;

            boolean isEven = number1 % 2 == 0;// when we divide the number by 2,if the remainder is 0, mean the number is even
            boolean isOdd = number1 % 2 != 0;// when we divide a number by 2, if the remainder is not 0, means number is odd.
            // boolean isOdd = !isEven; if the number is not even, then it is odd

            System.out.println(number1 + ": isOdd = " + isOdd);
            System.out.println(number1 + ": isEven = " + isEven);

            System.out.println("--------------------------------------------------");
        }

        // SOLUTION-3 CHECKING WITH IF & ELSE STATEMENT

        public static void OddOrEven ( int number){

            if (number % 2 == 0 && number != 0) {
                System.out.println(number + ", is an even number");

            } else if (number % 2 != 0) {
                System.out.println(number + ", is an odd number");

            } else {
                System.out.println("Equals to zero");
            }


            System.out.println("--------------------------------------------------");
        }

    }



/*
Write a method which can identifies given numbers is even or odd

EX:

identify(5) => "Odd"

identify(6) => "Even"

*/

