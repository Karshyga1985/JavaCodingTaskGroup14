package kara_solutions.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfChar {
    public static void main(String[] args) {
        System.out.println(mapFreqOfChar("hello"));
        System.out.println(mapFreqOfChar("hello world"));
    }

    public static Map<String, Integer> mapFreqOfChar(String str){

        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ch){
                    count++;
                }
                map.put(String.valueOf(str.charAt(i)), count);
            }
        }
        return map;
    }
}
/*
        Map-- Frequency of Characters
    `Write a method that prints the frequency of each character from a String.
     Example: input => "hello world"
     output => {h=1, e=1, l=3, o=2,  =1, w=1, r=1, d=1}
     */