package bilgehan_solutions.week6;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("658abcd0123edft"));
        System.out.println(sumOfDigits("123abc456ftg87"));

    }

    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Integer.parseInt("" + str.charAt(i));
            } else {
                continue;
            }

    }
        return sum;
    }
}
/*
    3-String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */