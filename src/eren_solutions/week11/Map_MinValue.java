package eren_solutions.week11;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_MinValue {

/*
Write a method that can return the minimum value from a map
(DO NOT use sort method).
*/

    // Method to find the minimum value in a Map
    public static <Key, Value extends Comparable<Value>> Value findMinValue(Map<Key, Value> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map is null or empty");
        }

        return Collections.min(map.values());
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Emma", 25);
        map.put("Alex", 40);
        map.put("Eren", 33);
        map.put("Mike", 55);
        map.put("Lisbeth", 34);
        map.put("Kerem",24);

        System.out.println("Minimum value: " + findMinValue(map));
    }

}








