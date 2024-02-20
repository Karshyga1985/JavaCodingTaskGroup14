package bilgehan_solutions.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("primeNumber(9) = " + (primeNumber(9)));
        System.out.println("primeNumber(19) = " + primeNumber(19));
        System.out.println("primeNumber(73) = " + primeNumber(73));
        System.out.println("primeNumber(2) = " + primeNumber(2));
        System.out.println("primeNumber(5) = " + primeNumber(5));
        System.out.println("primeNumber(254) = " + primeNumber(254));
    }
    public static boolean primeNumber(int num) {
        int count =0 ;
        for (int i = num; i >1 ; i--) {
            if (num % i ==0 )
                count ++;
        }
      //  boolean isPrimeNumber = count<2 ;

        return count<2 ;

    }


}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not

 */