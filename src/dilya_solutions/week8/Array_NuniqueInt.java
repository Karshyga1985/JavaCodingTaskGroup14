package dilya_solutions.week8;

import java.util.Arrays;

public class Array_NuniqueInt {
    public static int[] nUniqueINT(int num) {
        while(num < 1 || num > 100){
            System.err.println("Value must be between 1 and 100");
            System.exit(1);
        }
        int[] result = new int[num];
            if (num == 2) {
                result[0] = 1;
                result[1] = -1;
                return result;
            }
            int sum = 0;
            for (int i = 0; i < num - 1; i++) {
                result[i] = i;
                sum += i;
            }
            result[result.length - 1] = -sum;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nUniqueINT(99)));
    }
}
