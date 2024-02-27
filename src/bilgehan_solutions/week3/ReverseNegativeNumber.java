package bilgehan_solutions.week3;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int num){

        if(num >= 0){
            return num;
        }
        num *= -1;
        int result = 0;
        while(num>0){
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return -result;
    }
    //second solution
    public static int reverseNegNumString(int num){
        if (num>=0) {
            return num;
        }
        num *= -1 ;
        String str = "" + num;
        String reverseStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverseStr += "" + str.charAt(i);
        }
        return  Integer.parseInt(reverseStr)*-1;

    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-125));
        System.out.println(reverseNegNumString(-125));
        System.out.println(reverseNegativeNumber(-2489));
        System.out.println(reverseNegNumString(-2489));

    }
}
