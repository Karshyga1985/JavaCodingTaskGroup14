package week3Solutions;

public class PrimeNumber {

    public static boolean PrimeNumber(int num){

        for(int i=2; i<num; i++){

            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber(7));
        System.out.println(PrimeNumber(6));

    }

}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */