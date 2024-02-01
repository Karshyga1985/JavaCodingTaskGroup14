package talha_Solutions.week_1;

public class DivideWithoutOperator {
    /*
Task 2

Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
*/
    public static int division(int num1, int num2) {
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        return result;
    }

    public static void division2(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Can not divide by zero.");
        }
        int s = 1;
        if (num1 < 0) {
            s *= -1;
            num1 *= -1;
        }
        if (num2 < 0) {
            s *= -1;
            num2 *= -1;
        }
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        int a = 0;
        int t = 0;
        String result2 = ".";
        int z = num1 % num2;
        for (int i = 0; i < 9; i++) {
            z = z *= 10;
            while (z >= num2) {
                z -= num2;
                a++;

            }

            result2 += a;
            if (a >= 5) {
                t = a + 1;
            } else {
                t = a;
            }
            a = 0;
            z = z % num2;
        }
        while (result2.endsWith("0")){
            String str = result2.substring(0,result2.length()-1);
            result2=str;
        }

        result = result * s;
        System.out.println(result + result2 + t);

    }

}
