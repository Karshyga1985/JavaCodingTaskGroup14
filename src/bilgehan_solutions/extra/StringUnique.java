package bilgehan_solutions.extra;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringUnique {
    public static void main(String[] args) {
        String str = "frttfruhwnkldyyo";
        System.out.println(StringUnique(str));
        System.out.println(StringUnique2(str));

    }

    public static Map<String, Integer> StringUnique(String str) {
        Map<String, Integer> newMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                newMap.put(ch + "", 1);
            }
        }

        return newMap;
    }

    public static Map<String, Integer> StringUnique2(String str) {
        Map<String, Integer> newMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                newMap.put(ch + "", 1);
            }
        }

        return newMap;
    }
}
//    Take the unique characters of a String and save them into a map. Like {d=1,e=1} so
//        keys will be unique letters values will be 1