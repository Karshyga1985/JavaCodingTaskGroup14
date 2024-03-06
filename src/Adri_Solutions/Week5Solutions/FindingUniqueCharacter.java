package Adri_Solutions.Week5Solutions;

public class FindingUniqueCharacter {

    //String -- Find the unique
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String UniqueCharacter(String str){
        String uniqueCharacters = "";
        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if (count <=1){
                uniqueCharacters += str.charAt(i);
            }

        }

        return uniqueCharacters;

    }

    public static void main(String[] args) {


        System.out.println(UniqueCharacter("AAABBBCDDEF"));
    }

}
