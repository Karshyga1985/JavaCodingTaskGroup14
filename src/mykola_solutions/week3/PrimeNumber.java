package mykola_solutions.week3;

public class PrimeNumber {
    //1. Numbers -- Prime Number
    //Write a method that can check if a number is
    //prime or not
    public static boolean isPrimeNumber(int num){
        for(int i = 2; i < num; i++){
            if (num % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
    }

}
