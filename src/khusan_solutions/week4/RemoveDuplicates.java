package khusan_solutions.week4;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println("RemoveDuplicates(AAABBBCCC) = " + RemoveDuplicates(str));


    }

    public static String RemoveDuplicates(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {

            if(  ! (result.contains(""+ str.charAt(i)))   ){

                for (int j = 0; j < str.length(); j++) {

                    if(str.charAt(i) == str.charAt(j)){
                        result += str.charAt(i);
                        break;
                    }
                }
            }
        }
        return result;
    }

}


/*
        Write a return method that can remove the duplicated values from
        String
        Ex: removeDup("AAABBBCCC") ==> ABC
*/