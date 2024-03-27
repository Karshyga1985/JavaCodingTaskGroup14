package Adri_Solutions.Week6Solutions;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        System.out.println(SumOfDigits("764gefug743rhgi"));
    }


    public static int SumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i);
            if (Character.isDigit(eachCharacter)){
                sum += Integer.parseInt("" + str.charAt(i));
            }else{
                continue;
            }

        }
        return sum;
    }
}
//3-String -- sum of digits in a string
//Write a method that can return the sum of the digits in a string