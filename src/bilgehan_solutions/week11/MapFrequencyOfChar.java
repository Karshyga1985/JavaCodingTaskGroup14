package bilgehan_solutions.week11;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MapFrequencyOfChar {
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("Helloooo Worlllld"));
    }

    public static Map<String ,Integer> frequencyOfChar(String str) {
        Map<String ,Integer> freqChar = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i)+"";
            if(!(freqChar.containsKey(ch))){
                freqChar.put(ch ,1);
            }else{
                freqChar.put(ch, freqChar.get(ch)+1);
            }
        }
        return freqChar ;
    }



}
   /*
        Map-- Frequency of Characters
    `Write a method that prints the frequency of each character from a String.
     Example: input => "hello world"
     output => {h=1, e=1, l=3, o=2,  =1, w=1, r=1, d=1}
     */