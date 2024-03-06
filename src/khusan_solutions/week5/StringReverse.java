package khusan_solutions.week5;

public class StringReverse {

    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println("Using for loop: reverse of "+ str + ": " + reverse(str));
        System.out.println("Using while loop: reverse of " + str +": " + reverse_using_while(str));
    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {

            result += str.charAt(i);
        }

        return result;
    }

    public static String reverse_using_while(String str){

        String result = "";
        int i = str.length()-1;

        while(i >= 0){
            result += str.charAt(i);
            i--;
        }

        return result;
    }




}


/*
    String -- Reverse
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
 */