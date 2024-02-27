package dilya_solutions.week3;

public class ReverseNegative {
    //2.Reverse negative number: Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        System.out.println(reverseNum(-16));
    }
    public static int reverseNum(int num){
        if(num>=0){
            System.err.println("Number must be negative");
            System.exit(1);
        }
        int reverse = 0;
        while (num<0){

            while (num != 0){
                int remainder = num%10;
                reverse = reverse*10 + remainder;
                num /= 10;
            }

        }
        return -reverse;

    }
}
