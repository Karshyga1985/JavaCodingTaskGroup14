package week3Solutions;

public class ReverseNegativeNumber {

 public static int reverseNegativeInt(int num){
     boolean isNegative = num < 0 ? true : false;
     if (isNegative){
         num=num*-1;
     }
     String numAsString = Integer.toString(num);
     String result="";
     for (int i = numAsString.length()-1; i >= 0 ; i--) {

         result += numAsString.charAt(i);

     }
     int reversedNum= Integer.parseInt(result);

     return isNegative == true ? reversedNum*-1 : reversedNum;
 }

    public static void main(String[] args) {

        System.out.println(reverseNegativeInt(-956));
        System.out.println(reverseNegativeInt(956));
        System.out.println(reverseNegativeInt(-210));
        System.out.println(reverseNegativeInt(210));
        System.out.println(reverseNegativeInt(-100));
        System.out.println(reverseNegativeInt(100));


    }

}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int

 */
