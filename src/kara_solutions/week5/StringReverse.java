package kara_solutions.week5;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(stringReverse("ABCD"));
        System.out.println(stringReverse("KARSHYGA"));
        System.out.println(stringReverse("JAVA"));
        System.out.println(stringReverse("PYTHON"));
    }

    public static String stringReverse(String str){
        String reversedStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            reversedStr += str.charAt(i) + "";
        }
        return reversedStr;
    }



}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
*/