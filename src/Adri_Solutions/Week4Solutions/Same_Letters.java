package Adri_Solutions.Week4Solutions;

public class Same_Letters {

    //String -- Same letters
    //Write a return method that check if a string is build out of the
    //same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static Boolean SameLettersStrings(String str1, String str2){

        String compare ="";

        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)){
                    compare += str2.charAt(j);

                }
            }
        }

        if (compare.equals(str1)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(SameLettersStrings("cab", "abc"));
        System.out.println(SameLettersStrings("tod", "dot"));
        System.out.println(SameLettersStrings("fair", "hair"));


    }
}
