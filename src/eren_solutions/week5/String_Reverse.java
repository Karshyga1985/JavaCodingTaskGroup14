package eren_solutions.week5;

public class String_Reverse {


    public static void main(String[] args) {

        System.out.println(Reverse("ABCD"));
        System.out.println(Reverse("JAVA SDET BATCH 32"));
        System.out.println(Reverse("I LOVE JAVA"));


    }

 /*

    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

*/

    public static String Reverse(String word){

        String temp = "";

        char[] arr = word.toCharArray();
        for(int i = arr.length-1;i>=0;i--){
            temp = temp+arr[i];
        }
        return temp;
    }

}
