package christine_solutions.week3;

public class ReverseNegativeNumber {

    /*

    2. Numbers -- Reverse Negative Number

    Write a return method that can reverse negative number and return it as int.


    */

    public static void main(String[] args) {

        System.out.println("reverseNegativeNumber(-789) = " + reverseNegativeNumber(-789));
        System.out.println("reverseNegativeNumber(987) = " + reverseNegativeNumber(987));
        System.out.println("reverseNegativeNumber(-1234) = " + reverseNegativeNumber(-1234));

    }

    public static int reverseNegativeNumber(int num){

        String negNum = ("" + num).substring(1);
        String reverseNumString = "";

        if (num >= 0){
            return num;
        }

        for (int i = negNum.length()-1 ; i >= 0 ; i--) {
            reverseNumString += "" + negNum.charAt(i);
        }

        int reverseNum = Integer.parseInt(reverseNumString);


        return reverseNum;
    }


}
