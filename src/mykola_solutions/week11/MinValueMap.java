package mykola_solutions.week11;

import java.awt.dnd.DragSource;
import java.util.*;

public class MinValueMap {
       /*
    Map - Min value
Write a method that can return the minimum value from a map
(DO NOT use sort method).
     */

    public static int returnMinValueFromMap(Map<String, Integer> map) {
        Map<Integer, Integer> testMap = new TreeMap<>();

        for (Integer eachValue : map.values()) {
            testMap.put(eachValue,0);
        }

        for (Integer i : testMap.keySet()) {
            return i;
        }

        return 0;

    }


    public static int returnMaxValueFromMap(Map<String, Integer> map) {
        Map<Integer, Integer> testMap = new TreeMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer eachValue : map.values()) {
            testMap.put(eachValue,0);
        }
        for (Integer eachKey : testMap.keySet()) {
            stack.add(eachKey);
        }

        return stack.pop();




    }

    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("two", -5);
        map.put("gne", 100);
        map.put("three", 5);
        map.put("four", -110);
        map.put("five", 18);
        map.put("six", 101);
        map.put("fie", 18);
        map.put("fieve", 18);
        map.put("fwwieve", 1668);
        map.put("fievde", 18);

        System.out.println(returnMinValueFromMap(map));
        System.out.println(returnMaxValueFromMap(map));
    }


}
