package christine_solutions.week6;

import java.util.ArrayList;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("sum(\"2,5,6,8\") = " + sum("2,5,6,8"));
        System.out.println("sum(\"14, 25, 3\") = " + sum("14, 25, 3"));
        System.out.println("sum(\"abc, 123, 4, 56\") = " + sum("abc, 123, 4, 56"));
    }


    public static int sum(String nums){


        int sum = 0;

        String[] arr = nums.split(",");


        for (String each : arr) {
            each = each.trim();

            if ( !(Character.isDigit(each.charAt(0))) ){
                continue;
            }

            sum += Integer.parseInt(each);
        }


        return sum;
    }

}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */