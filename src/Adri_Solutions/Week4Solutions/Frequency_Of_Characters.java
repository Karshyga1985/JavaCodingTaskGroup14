package Adri_Solutions.Week4Solutions;

public class Frequency_Of_Characters {

    //String -- Frequency of Characters
    //Write a return method that can find the frequency of
    //characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String FrequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count=0;
                if (!result.contains(""+str.charAt(i))) {
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) == str.charAt(i)) {
                            count++;
                        }
                    }

                    result += str.charAt(i) + "" + count;
                }
            }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(FrequencyOfCharacters("aaabbcccp"));
    }

}
