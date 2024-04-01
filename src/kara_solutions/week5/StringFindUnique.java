package kara_solutions.week5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringFindUnique {
    public static void main(String[] args) {
        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println(findUnique1("AAABBBCCCDEF"));
        System.out.println(findUnique("ABCCCDDDEFFFF"));
        System.out.println(findUnique1("AAABBBCDDEEFFFD"));
    }


    public static String findUnique(String str){
        String unique = "";
        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            if(str.indexOf(each) == str.lastIndexOf(each)){//0 == 2 9 == 9
                unique += each;//DEF
            }
        }
        return unique;
    }

    public static String findUnique1(String str) {
        String unique = "";
        Set<Character> allChar = new HashSet<>();//DEF
        Set<Character> duplicates = new HashSet<>();//ABC

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (allChar.contains(each)) {
                duplicates.add(each);
            } else {
                allChar.add(each);
            }
        }
        allChar.removeAll(duplicates);

        for (Character eachChar : allChar) {
            unique += eachChar;
        }
        return unique;
    }
}
/*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";
*/