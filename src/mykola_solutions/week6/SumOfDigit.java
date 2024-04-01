package mykola_solutions.week6;

public class SumOfDigit {
    //3-String -- sum of digits in a string
//Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {

        String str = "123d4568688255hgf";
        System.out.println(sumOfDigit(str));

    }

    public static int sumOfDigit(String digit) {
        int num = 0;
        String[] arr = digit.split("");
        for (String each : arr) {
            try {
                num += Integer.parseInt(each);
            }catch (NumberFormatException e ){
                System.out.println("Som part of the String is not a digit here is the sum of all digits only");
            }

        }

        return num;
    }


}
