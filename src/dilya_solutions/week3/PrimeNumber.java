package dilya_solutions.week3;

public class PrimeNumber {
    //1.Prime Number: Write a method that can check if a number is prime or not
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println( isPrime(4));
    }

    public static boolean isPrime(int num){

      for(int i = 2; i < num; i++){
          if(num%i==0){
              return false;
          }
      }
      return true;
    }
}
