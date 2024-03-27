package christine_solutions.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("isPrimeNumber(1) = " + isPrimeNumber(1));
        System.out.println("isPrimeNumber(3) = " + isPrimeNumber(3));
        System.out.println("isPrimeNumber(20) = " + isPrimeNumber(20));
        System.out.println("isPrimeNumber(0) = " + isPrimeNumber(0));

    }


    public static boolean isPrimeNumber(int num){

        if(num == 0 || num == 1){
            return false;
        }

        for (int i = 2; i < num ; i++) {

            if(num % i == 0 ){
                return false;
            }

        }
        return true;
    }



   /*

    1. Numbers -- Prime Number

    Write a method that can check if a number is prime or not.


*/





}
