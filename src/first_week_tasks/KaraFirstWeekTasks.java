package first_week_tasks;

public class KaraFirstWeekTasks {

    public static void main(String[] args) {
        oddAndEvenNumber(5);
        oddAndEvenNumber(6);
        oddAndEvenNumber(15);
        System.out.println(oddAndEven(18));
        divideWithout(20, 8);
        finra(100);
        System.out.println();
        finra2(30);

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
        while(num1 >= num2){// 20 >= 8 true 12 >= 8 true  4 >= 8 false num1 = 4
            num1 -= num2; // 20 - 8 = 12  12 - 8 = 4
            count++; // 1 -> 2
        }
        System.out.println(count + " with remainder " + num1);

    }

    /*
    Task 3
    FINRA:
    Write a method which prints out the numbers from  1 to 30 but for numbers which
    are a multiple of 3 print "FIN" instead of the number and for numbers which are
    a multiple of 5, print "RA" instead of the number. For numbers which are a
    multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    // solution 1
    public static void finra(int number){
        for(int i = 1; i <= number; i++){
            if(i % 15 == 0){
                System.out.print("FINRA ");
            } else if(i % 5 == 0){
                System.out.print("RA ");
            } else if (i % 3 == 0){
                System.out.print("FIN ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
    // solution 2
    public static void finra2(int number){

        for(int i = 1; i <= number; i++){
            String result = "";
            if(i % 3 == 0){
                result += "FIN";
            }
            if(i % 5 == 0){
                result += "RA";
            }
            System.out.println(result.isEmpty()? i : result);
        }
    }






}
