package Adri_Solutions.Week5Solutions;

public class ReverseString {

    //String -- Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA


    public static String Reverse (String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {

            reverse += str.charAt(i);
        }

        return reverse;
    }


    public static void main(String[] args) {

        System.out.println(Reverse("levander"));

    }
}
