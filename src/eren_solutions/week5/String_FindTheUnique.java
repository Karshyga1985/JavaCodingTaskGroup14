package eren_solutions.week5;

public class String_FindTheUnique {


/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

*/

    public static void main(String[] args) {
        String str = "";

        findTheUnique("AAABBBCCCDEF");
    }

    private static void findTheUnique(String str) {

        int[] count = new int[23456];// taking count of characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // the character which has arrived only one time in the string will be printed out
            if (count[ch] == 1) {
                System.out.println("index => " + i + " and unique character => " + str.charAt(i));

            }
        }

    } // unique

}
