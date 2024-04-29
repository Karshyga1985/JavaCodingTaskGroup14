package eren_solutions.week12_extras;

public class ArmstrongNumber {

   /*
   Write a method that can check if a number is an Armstrong number.

Armstrong number is the number in any given number base, which forms the total of the same number, when each of its digits is raised to the power of the number of digits in the number. It is of special interest to new programmers and those learning a new programming language because of the way the number behaves in a given number base.

For example, using a simple number 153 and the decimal system, we see there are 3 digits in it. If we do a simple mathematical operation of raising each of its digits to the power of 3, and then totalling the sum obtained, we get 153. That is 1 to the power of 3 5 to the power of 3 3 to the power of three is 1 125 27 153. This can also be represented as 1^3 5^3 3^3=153. The number 153 is an example of the Armstrong number which also has a unique property that one can use any number system.

*/


    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong(123));
        System.out.println(isArmStrong2(154));
    }

    public static boolean isArmstrong(int n){

        String strNum = "" + n;
        int nLen = strNum.length();
        int sum = 0;

        for(int i = 0; i < strNum.length(); i++){
            int eachDigit = Integer.parseInt(strNum.substring(i , i + 1)); // "" + strNum.charAt(i)
            sum += (int) Math.pow(eachDigit, nLen);   // each digit ^ pow
        }

        return sum == n;
    }

    public static boolean isArmStrong2(int n) { //

        int temp = n;
        int digits = 0;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        temp = n; // assigns the n value again
        int sum = 0;

        while(temp > 0){
            int eachDigit = temp % 10; // read the last digit
            sum += (int) Math.pow(eachDigit, digits);
            temp /= 10;
        }

        return sum == n;
    }

}
