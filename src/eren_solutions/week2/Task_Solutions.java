package eren_solutions.week2;

public class Task_Solutions {

    //TASK-1: SwapNumbers
    /*
        Swap two variable values without using a third variable
        */
    public static void main(String[] args) {


        consecutiveNumbers(50);


        System.out.println("===================================");


        int a = 10;
        int b = 15;

        a = a + b; // 25
        b = a - b; // 10
        a = a - b; // a = 15, b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("=================================");

/*   TASK-2: DivisibleBy3And5And15

        Create a program that will print all the numbers divisible by 3, 5, and 15 in the range from 1 to the given N number. Print the grouped sections separately

         Ex:
            input: 100
            output:
                 Divisible By 15: 15 30 45 60 75 90
                 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */

        int n = 50;

        String by15 = "", by5 = "", by3 = "";

        for (int i = 1; i <= n; i++) {

            if (i % 15 == 0) {
                by15 += i + " ";

            } else if (i % 5 == 0) {
                by5 += i + " ";

            } else if (i % 3 == 0) {
                by3 += i + " ";

            }

        }

        System.out.println("by15 = " + by15);
        System.out.println("by5 = " + by5);
        System.out.println("by3 = " + by3);


        System.out.println("===============================");

/*    TASK-3: Consecutive Numbers

        Create a method to print consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers, it should be replaced by a concatenation of the respective words.
        The given N value will be a positive integer.

            parameter: int
            return: void

        Example of a number being divisible by 2 & 3:
            when the number is 6, the output should be CodilityTest because 6 is divisible by 2 and 3

        Example of a number being divisible by 2 & 5:
            when the number is 10, the output should be Codi1ityCoders because 10 is divisible by 2 and 5

        Ex:
            input: 16
            output:
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
     */


    }

    public static void consecutiveNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? i : result);
        }

    }

}
