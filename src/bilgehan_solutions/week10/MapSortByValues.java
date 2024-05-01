package bilgehan_solutions.week10;

import java.util.*;

public class MapSortByValues {
    public static void main(String[] args) {
        Map<Integer, Integer> maps = new LinkedHashMap<>();
        maps.put(1, 8);
        maps.put(3, -24);
        maps.put(2, 68);
        maps.put(5, 56);
        maps.put(4, -263);
        maps.put(9, 618);

        System.out.println(sortMapValues(maps));



    }

    public static Map<Integer, Integer> sortMapValues(Map<Integer, Integer> maps) {

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(maps.entrySet());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getValue() > list.get(j + 1).getValue()) {
                    Map.Entry<Integer, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        Map<Integer, Integer> mapsSorted = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> eachEntry : list) {
            mapsSorted.put(eachEntry.getKey(), eachEntry.getValue());
        }
        return mapsSorted;
 }

    public static Map<Integer, Integer> sortMapValues2(Map<Integer, Integer> maps) {

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(maps.entrySet());


        for (int j = 0; j < list.size() - 1; j++) {
            if (list.get(j).getValue() > list.get(j + 1).getValue()) {
                Map.Entry<Integer, Integer> temp = list.get(j+1);
                list.set(j + 1, list.get(j));
                list.set(j, temp);
            }
        }

        return maps;
    }


    public static Map<Integer, Integer> sortMapValues3(Map<Integer, Integer> maps) {

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(maps.entrySet());
        Map<Integer, Integer> sorted = new LinkedHashMap<>();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getValue() > list.get(j + 1).getValue()) {
                    Map.Entry<Integer, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
            sorted.put(list.get(i).getKey() , list.get(i).getValue());
        }

        return sorted;
    }

}