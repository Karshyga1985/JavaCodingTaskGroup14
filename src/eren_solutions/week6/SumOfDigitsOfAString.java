package eren_solutions.week6;

public class SumOfDigitsOfAString {


    /*
    3-String -- sum of digits in a string
    Writes a method that can return the sum of the digits in a string
     */


    // Function to calculate a sum of all numbers present in a string containing alphanumeric characters

    public static int findSumOfDigits(String str){

        String temp = "0"; // A temporary string holds a sum of all numbers present in the string

        int sum = 0;// read each character in input string

        for (int i = 0; i < str.length(); i++) {// if current character is a digit
            char ch = str.charAt(i);


            if (Character.isDigit(ch)) {
                temp += ch; // if current character is an alphabet

            }else {

                sum += Integer.parseInt(temp); // increment sum by number found earlier (if any)

                temp = "0"; // reset temporary string to empty
            }
        }

        return sum + Integer.parseInt(temp);
    }

    // Driver code (main method)
    public static void main(String[] args) {


        String str1 = "12abc20yz8";  // input alphanumeric string
        String str2 = "244r3mjr44";
        String str3 = "kfkf345678";

        System.out.println(findSumOfDigits(str1));  // Function call
        System.out.println(findSumOfDigits(str2));
        System.out.println(findSumOfDigits(str3));
    }


}
