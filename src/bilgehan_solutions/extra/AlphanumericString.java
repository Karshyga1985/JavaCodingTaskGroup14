package bilgehan_solutions.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AlphanumericString {
    public static void main(String[] args) {
        String str = "DCER501GCCCA098911";
        // System.out.println(sortString(str));
        String result = "";
        String sorted = "";

        for (int i = 0; i < str.length() - 1; i++) {
            Character ch = str.charAt(i);
            Character ch1 = str.charAt(i + 1);
            if (Character.isLetter(ch)) {
                if (Character.isLetter(ch1)) {
                    result += ch + "";
                } else {
                    result += ch + ",";
                }
            }
            if (Character.isDigit(ch)) {
                if (Character.isDigit(ch1)) {
                    result += ch + "";
                } else {
                    result += ch + ",";
                }
            }
        }

        System.out.println(result);
        String[] arr1 = result.split(",");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>();


        for (String each : list) {
            char[] arr2 = each.toCharArray();
            String elm = "";
            for (int i = 0; i < arr2.length - 1; i++) {
                for (int j = 0; j < arr2.length - 1; j++) {
                    if (arr2[j] > arr2[j + 1]) {
                        char temp = arr2[j + 1];
                        arr2[j + 1] = arr2[j];
                        arr2[j] = temp;
                    }
                }

            }
            System.out.println(Arrays.toString(arr2));

            for (char each1 : arr2) {
                elm += "" + each1;
            }
            sorted += elm;
            //  list2.add(elm);
        }
//        System.out.println(list2);
//        for (String s : list2) {
//            sorted += s;
//        }
        System.out.println("sorted = " + sorted);
    }


    public static String sortString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            Character ch1 = str.charAt(i + 1);
            if (Character.isLetter(ch)) {
                if (Character.isLetter(ch1)) {
                    result += ch + "";
                } else {
                    result += ch + ",";
                }
            }
            if (Character.isDigit(ch)) {
                if (Character.isDigit(ch1)) {
                    result += ch + "";
                } else {
                    result += ch + ",";
                }
            }
        }


        return result;
    }

}

//    Given an alphanumeric String, we need to split the string into substrings of consecutive
//        letters or numbers, sort the individual string and append them back together.
//        Ex:
//        Input: "DC501GCCCA098911"
//        OutPut: "CD015ACCCG011899"