package Adri_Solutions.Week4Solutions;

public class Remove_duplicates {

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from
    //String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static String RemoveDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(""+str.charAt(i))){

                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(RemoveDuplicates("AAAHHHGHB"));

    }

}
