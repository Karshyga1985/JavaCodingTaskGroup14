package christine_solutions.week6;

import java.util.ArrayList;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("sum(\"2,5,6,8\") = " + sum("2,5,6,8"));
    }


    public static int sum(String nums){


        int sum = 0;

        String[] arr = nums.split(",");


        for (String each : arr) {
            sum += Integer.parseInt(each);
        }


        return sum;
    }

}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */