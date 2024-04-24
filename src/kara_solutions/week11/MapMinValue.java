package kara_solutions.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMinValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 10);
        map.put("orange", 15);
        map.put("carrot", 3);
        map.put("potato", 1);
        map.put("grape", 5);


        System.out.println(minValueOfMap(map));
    }

    public static <K, V extends Comparable<V>> V minValueOfMap(Map<K, V> map) {
        // Check if the map is empty
        if (map.isEmpty()) {
            throw new IllegalArgumentException("The map is empty. Cannot find minimum value.");
        }

        // Use an iterator to get the first value as the initial minimum
        V minValue = map.values().iterator().next();

        // Iterate through the rest of the map's values
        for (V value : map.values()) {
            // Update minValue if a smaller value is found
            if (value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }

        return minValue;
    }
}
