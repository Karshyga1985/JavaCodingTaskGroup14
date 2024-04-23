package mykola_solutions.week10;

import java.util.*;

public class MapSortByValue {

    /*
    Write a method that can sort the Map by values.
     */

    public static Map<Integer,Integer> sortByValue(Map<Integer,Integer> map){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> result = new LinkedHashMap<>();
        for (Integer eachValue : map.values()) {
            list.add(eachValue);
        }

        for (int i = 0; i < list.size(); i++) {


            for (Map.Entry<Integer, Integer> eachMap : map.entrySet()) {
                if (eachMap.getValue() == Collections.max(list)) {
                    result.put(eachMap.getKey(), eachMap.getValue());
                    list.removeIf(p -> p == Collections.max(list));
                }

            }
        }



        return result;

    }

    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,26);
        map.put(2,22);
        map.put(3,18);
        map.put(4,67);
        map.put(5,266);
        map.put(6,180);
        map.put(7,3);
        map.put(8,6);
        map.put(9,26);



        System.out.println(map);
        System.out.println(sortByValue(map));



    }

}
