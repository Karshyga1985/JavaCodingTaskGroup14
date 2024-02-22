package talha_Solutions.week_1;

public class OddOrEven {

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



}
