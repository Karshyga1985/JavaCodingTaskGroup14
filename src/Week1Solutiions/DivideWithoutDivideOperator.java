package Week1Solutiions;

public class DivideWithoutDivideOperator {
    public static void divideWithoutOperator(int num1, int num2) {
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        if (num1 >= num2) {
            System.out.println("Result: " + result + ", remainder: " + num1);
        } else {
            System.out.println("First number must be greater than second number");


        }
    }
}
  /*
    Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
     */