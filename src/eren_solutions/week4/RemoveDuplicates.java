package eren_solutions.week4;

public class RemoveDuplicates {


    public static void main(String[] args) {


            /*

    String_Task#3 --> Remove Duplicates
    Write a return method that can remove the duplicated values from
    String

         Ex: removeDup("AAABBBCCC") ==> ABC
    */

        String str1 = "AAABBBCCCDDDEEEEEFFGGHHHHIJKLLMMNNOPRTSUUVYYYZZXWWWQQQ";

        String result1 = "";  // "ABC......."

        for (int i = 0; i < str1.length(); i++) { // i: index numbers of given String str1;
            // System.out.println(str1.charAt(i));

            char each = str1.charAt(i); // each character of the String str1===> (a,a,b,b,b,c,c,c)

            if (!result1.contains("" + each)) { // if the String result does not contain the character of string str1 yet
                result1 += each; // then we will add the character to a string result
            }
            // if the character is not contained yet in the new string, then we will add it to the new string
        }

        System.out.println(result1);
    }
}
