package bilgehan_solutions.extra;

import java.util.ArrayList;
import java.util.Arrays;

public class Armstrong {
    public static void main(String[] args) {

        int num = 153;
        int num2 = 6987;
        System.out.println(armstrong(num));
        System.out.println(armstrong(num2));
    }
    public static boolean armstrong(int num){
        int sum = 0;


        String str = String.valueOf(num) ;
        //   System.out.println("str = " + str);

        for (int i = 0; i < str.length(); i++) {
            String digit = str.charAt(i) + "" ;
            int dig = Integer.parseInt(digit) ;
            int mul=1;
            for (int j = 0; j <str.length(); j++) {
                mul*= dig ;
            }
            sum+=mul;
        }
      return sum==num ;
    }
}
//    Armstrong number is the number in any given number base, which forms the total of the same number, when each of its digits is raised to the power of the number of digits in the number. It is of special interest to new programmers and those learning a new programming language because of the way the number behaves in a given number base.
//
//        For example, using a simple number 153 and the decimal system, we see there are 3 digits in it. If we do a simple mathematical operation of raising each of its digits to the power of 3, and then totalling the sum obtained, we get 153. That is 1 to the power of 3 5 to the power of 3 3 to the power of three is 1 125 27 153. This can also be represented as 1^3 5^3 3^3=153. The number 153 is an example of the Armstrong number which also has a unique property that one can use any number system.