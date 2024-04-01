package kara_solutions.week6;

public class SumOfDigitsInAString {
    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"aaad5dd85ddd2ss6\") = " + sumOfDigits("aaad5dd85ddd2ss6"));
        System.out.println("sumOfDigits1(\"AARK123RFGHd22\") = " + sumOfDigits1("AARK123RFGHd22"));
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
                char each = str.charAt(i);
                if (each >= '0' && each <= '9') {
                    sum += each - '0';
                }
        }
        return sum;
    }

    public static int sumOfDigits1(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            if(Character.isDigit(each)){
                sum += Integer.parseInt(str.valueOf(each));
            }
        }
        return sum;
    }

}
/*
    3-String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
*/