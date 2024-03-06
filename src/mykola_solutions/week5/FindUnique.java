package mykola_solutions.week5;

import java.util.*;

public class FindUnique {

    public static void main(String[] args) {


        System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(unique2("AAABBBCCCDEF"));
        System.out.println(unique3("AAABBBCCCDEF"));
    }


    public static String unique(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (!str2.contains(str.charAt(i) + "")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                if (count == 1) {
                    str2 += str.charAt(i);
                }
            }
        }

        return str2;
    }

    public static String unique2(String str) {
        String str2 = "";


        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p -> Collections.frequency(list, p) != 1);
        for (String each : list) {

            str2 += each;

        }

        return str2;

    }

    public static String unique3(String str) {
        String str2 = "";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (Collections.frequency(list, iterator.next()) !=1 ) {
                iterator.remove();
            }
        }

        for (String each : list) {
            str2 += each;
        }

        return str2;

    }












}
