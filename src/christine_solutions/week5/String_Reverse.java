package christine_solutions.week5;

public class String_Reverse {


    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
*/

    public static void main(String[] args) {
        System.out.println("reverseString(\"hoodie\") = " + reverseString("hoodie"));

        System.out.println("reverseString2(\"changes\") = " + reverseString2("changes"));
    }

    public static String reverseString(String str){

        String reverse = "";
        int i = str.length()-1;

        while ( i >= 0 ){
            reverse += str.charAt(i);
            i--;
        }
        return reverse;
    }

    public static String reverseString2(String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse += str.charAt(i);

        }


        return reverse;
    }







}
