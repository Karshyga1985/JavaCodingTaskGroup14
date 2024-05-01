package mykola_solutions.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
     /*
        Map-- Frequency of Characters
    `Write a method that prints the frequency of each character from a String.
     Example: input => "hello world"
     output => {h=1, e=1, l=3, o=2,  =1, w=1, r=1, d=1}
     */
    public static String frequencyOfChar(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (!result.contains(""+str.charAt(i))){
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result += " - "+count+str.charAt(i);
            }

        }
        return result;
    }


    public static Map<String,Integer> frequencyOfCharMap(String str){
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                   count++;
                }
            }
            map.put(str.charAt(i)+"",count);
        }
        return map;
    }

    public static Map<Character,Integer> frequency2(String str){
        Map<Character,Integer> result = new LinkedHashMap<>();

        for (char eachChar : str.toCharArray()) {
            if(result.containsKey(eachChar)){
                result.put(eachChar,result.get(eachChar)+1);
            }else {
                result.put(eachChar,1);
            }
        }
        return result;
    }



    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(frequencyOfChar(str));

        System.out.println(frequencyOfCharMap(str));



    }



}
