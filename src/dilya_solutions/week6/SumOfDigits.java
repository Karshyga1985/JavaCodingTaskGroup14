package dilya_solutions.week6;

public class SumOfDigits {
    public static int sumDigits(String str){
        int sum = 0;

        for(char each : str.toCharArray()){
            if(Character.isDigit(each)) {
                sum += Integer.parseInt(String.valueOf(each));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("123"));
    }
}
