package eren_solutions.week10;

import java.util.*;

public class SortTheMapByValues {


    // Method to sort a Map by values
    public static <Key, Value extends Comparable<? super Value>> Map<Key, Value> sortByValue(Map<Key, Value> map) {
        List<Map.Entry<Key, Value>> list = new LinkedList<>(map.entrySet());

        // Sort the list of entries based on the values
        list.sort(Map.Entry.comparingByValue());

        // Create a LinkedHashMap to store the sorted entries
        Map<Key, Value> sortedMap = new LinkedHashMap<>();
        list.forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        return sortedMap;
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("John", 30);
        unsortedMap.put("Emma", 25);
        unsortedMap.put("Alex", 40);
        unsortedMap.put("Michael", 35);
        unsortedMap.put("Eren",33);
        unsortedMap.put("Mykola",31);
        unsortedMap.put("Khusan",36);

        System.out.println("Unsorted Map: " + unsortedMap);

        Map<String, Integer> sortedMap = sortByValue(unsortedMap);

        System.out.println("Sorted Map: " + sortedMap);
    }












}
