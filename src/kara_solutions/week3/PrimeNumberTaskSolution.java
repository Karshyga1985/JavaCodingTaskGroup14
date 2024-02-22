package kara_solutions.week3;

public class PrimeNumberTaskSolution {

    public static void main(String[] args) {
        System.out.println("isPrime(25) = " + isPrime(25));
        System.out.println("isPrime(17) = " + isPrime(17));
        System.out.println("isPrime(5) = " + isPrime(5));
        System.out.println("isPrime(13) = " + isPrime(13));
        System.out.println("isPrime(14) = " + isPrime(14));
        System.out.println("isPrime(195) = " + isPrime(195));
        System.out.println("isPrime(3) = " + isPrime(3));
        System.out.println("isPrime(-5) = " + isPrime(1));
        System.out.println("isPrime(123) = " + isPrime(123));
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
 /*
    1. Numbers -- Prime Number
    Write a method that can check if a number is prime or not.
*/