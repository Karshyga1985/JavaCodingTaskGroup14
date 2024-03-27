package bilgehan_solutions.week4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
        removeDuplicates2("AAABBBCCC");
        System.out.println();
        removeDuplicates2("AAAdBBdBCdCC");
    }

    public static String removeDuplicates(String word) {
        String str = "";

        for (int i = 0; i < word.length(); i++) {
            if (!(str.contains(word.charAt(i) + ""))) {
                str += word.charAt(i) + "";
            }
        }
        return str;
    }

    public static void removeDuplicates2(String word) {
        Set<String> wordch = new LinkedHashSet<>(Arrays.asList(word.split("")));
        for (String each : wordch) {
            System.out.print(each);
        }


    }


}
/*
        Write a return method that can remove the duplicated values from
        String
        Ex: removeDup("AAABBBCCC") ==> ABC
     */