package mykola_solutions.week3;

public class ReverseNegativeNumber {
    //2. Numbers -- Reverse negative number
    //Write a return method that can reverse
    //negative number and return it as int

    public static int reverseNumber(int num) {
        if (num >= 0) {
            throw new ArithmeticException("Please provide negative number");
        }
        String reverse = ("" + num).substring(1);
        StringBuilder builder = new StringBuilder(reverse);
        reverse = builder.reverse().toString();

        int result = Integer.parseInt(reverse);
        return result;

    }
    public static int reverseNumber4(int num){
        int temp = num;
        if (num < 0) {
            num = -num;
        }
        int result = 0;
        while (num > 0){
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /=10;
        }
        if (temp < 0){
            return -result;
        }
        return result;
    }




    public static int reverseNumber2(int num) {
        if (num < 0){
            num -= (2 * num);
        }
        int reverse = 0;
        while (num > 0) {
            int lastNumber = num % 10;
            reverse = reverse * 10 + lastNumber;
            num /= 10;
        }

        return reverse;
    }


    public static void main(String[] args) {
        System.out.println(reverseNumber(-12345));
        System.out.println(reverseNumber2(-12345));
        System.out.println(reverseNumber3(12345));
        System.out.println(reverseNumber4(-12345));
    }


    public static int reverseNumber3(int num){
        int temp = num;
        if (num < 0){
            num = -num;
        }
        int reverse = 0;
        while (num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;

            num /= 10;
        }

        if (temp < 0){
            return -reverse;
        }


        return reverse;
    }






















}
