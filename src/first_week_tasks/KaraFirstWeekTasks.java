package first_week_tasks;

public class KaraFirstWeekTasks {

    public static void main(String[] args) {
        oddAndEvenNumber(5);
        oddAndEvenNumber(6);
        oddAndEvenNumber(15);
        System.out.println(oddAndEven(18));
        divideWithout(20, 8);

    }
     /*
    Task 1
    Numbers -- odd & even
    Write a method which can identifies given number is even or odd
    Ex: identify(5) -> "Odd"
        identify(6) -> "Even"
     */
    // Solution 1 for Task 1
    public static void oddAndEvenNumber(int number){
        if(number % 2 == 0){
            System.out.println(number + " is even number.");
        }else{
            System.out.println(number + " is odd number.");
        }
    }
    // Solution 2 for Task 1
    public static String oddAndEven(int number){
        return number % 2 == 0 ? number + " is even number" : number + " is odd number";
    }

    /*
    Task 2
    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator
     */

    public static void divideWithout(int num1, int num2){
        int count = 0;
        while(num1 >= num2){// 20 >= 8 true
            num1 -= num2; // 20
            count++;
        }
        System.out.println(count + " with remainder " + num1);

    }






}
