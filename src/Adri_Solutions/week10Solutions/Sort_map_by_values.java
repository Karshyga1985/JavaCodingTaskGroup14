package Adri_Solutions.week10Solutions;

import java.util.*;

public class Sort_map_by_values {

    public static void main(String[] args) {

        Map<Integer, String> unsortedMap = Map.of(3,"a", 1, "b", 2, "e", 5, "d");

        System.out.println(sortByValue(unsortedMap));


    }


    public static LinkedHashMap<Integer, String> sortByValue(Map<Integer, String> map) {

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        list.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        return sortedMap;
    }

}
/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */
