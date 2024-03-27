package khusan_solutions.week6;

import christine_solutions.week1.ChristineFirstWeekTask;

import java.util.Collections;

public class SumOfDigitsInAString {

    public static void main(String[] args) {

        String str = "a1as2634728hfsjkwu9ruowieasa23daadff3f43ffaf4aa";

        System.out.println(sumOfDigits_forEach(str));
        System.out.println(sumOfDigits_fori(str));
        System.out.println(sumOfDigits_with_0(str));
        System.out.println(sumOfDigits_with_Character(str));
    }

    public static int sumOfDigits_forEach(String str){
        //How do I apply the for-each loop to every character in a String?
        //MyClass.java:20: foreach not applicable to expression type
        //You need to convert the String object into an array of char using the toCharArray() method of the String class:
        char[] arr = str.toCharArray();

        int count = 0;

        for (char eachChar : arr) {
            if(Character.isDigit(eachChar)){
                count += Integer.parseInt(String.valueOf(eachChar));
            }
        }
        return count;
    }
    public static int sumOfDigits_fori(String str){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                count += Integer.parseInt( String.valueOf( str.charAt(i) ) );
            }

        }
        return count;
    }
    public static int sumOfDigits_with_0(String str){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                count += str.charAt(i) - '0';  // converts char to an interger
            }

        }
        return count;
    }
    public static int sumOfDigits_with_Character(String str){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                count += Character.getNumericValue(str.charAt(i));  // This could be a simple and efficient way
            }

        }
        return count;
    }

    /*
        3-String -- sum of digits in a string
        Write a method that can return the sum of the digits in a string
     */
}
