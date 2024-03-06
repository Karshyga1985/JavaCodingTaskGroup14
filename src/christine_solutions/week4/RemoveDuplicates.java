package christine_solutions.week4;

public class RemoveDuplicates {
    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from
    //String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {


        System.out.println("removeDuplicates(\"cookies\") = " + removeDuplicates("cookies"));
        System.out.println("removeDuplicates(\"alfalfa\") = " + removeDuplicates("alfalfa"));
        System.out.println("removeDuplicates(\"aaabbbcccdddef\") = " + removeDuplicates("aaabbbcccdddef"));


    }


    public static String removeDuplicates(String str1){

        String result = "";

        for (int i = 0; i < str1.length(); i++) { //iterates through original string

                if( !(result.contains(str1.charAt(i) + "")) ) { // if string result does not have char...

                    result += str1.charAt(i); // ...char will be added to new string

                }

        }

        return result;

    }




}
