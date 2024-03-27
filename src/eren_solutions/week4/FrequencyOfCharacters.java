package eren_solutions.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


         /*
   String_Task#1 --> Frequency of Characters
    Writes a return method that can find the frequency of  characters

      Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */

        String str = "AAABBCDD";


        String result = "";  // A3B2C1D2

        // A B C D
        // 3 2 1 2

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }

            }

            if (result.contains("" + ch)) { // if the character is already included in the result
                continue; // skip that character
            }
            result += ch + "" + count;
        }

        System.out.println(result);

    }

}
