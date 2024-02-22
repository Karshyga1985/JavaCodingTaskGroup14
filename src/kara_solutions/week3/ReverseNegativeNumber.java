package kara_solutions.week3;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int negativeNumber){

        if(negativeNumber >= 0){
            return negativeNumber;
        }
        int positiveNumber = -negativeNumber;
        int result = 0;
        while(positiveNumber != 0){
            int temp = positiveNumber % 10;
            result = result * 10 + temp;
            positiveNumber /= 10;
        }
        return -result;
    }
    //second solution
    public static int reversedNegNumber(int numberNegative){
        String str = ("" + numberNegative).substring(1);
        String reversedStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversedStr += "" + str.charAt(i);
        }
        int reversedNumber = Integer.parseInt(reversedStr);
        return -reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println("reverseNegativeNumber(-1542) = " + reverseNegativeNumber(-1542));
        System.out.println("reversedNegNumber(-123) = " + reversedNegNumber(-123));
    }
}
 /*
    2. Numbers -- Reverse Negative Number
    Write a return method that can reverse negative number and return it as int.
    */