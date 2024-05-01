package bilgehan_solutions.week11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MapMinValue {
    public static void main(String[] args) {
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("a", 8);
        maps.put("b", 24);
        maps.put("c", 68);
        maps.put("d", 56);
        maps.put("e" , 263);
        maps.put("f", 618);

        System.out.println(mapMinValue(maps));

    }

    public static int mapMinValue(Map<String , Integer> mapMin){


        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(mapMin.entrySet());
 int min = list.get(0).getValue();
        for (Map.Entry<String, Integer> eachMap : list) {
           if(eachMap.getValue()<min){
               min = eachMap.getValue();
           }
        }
      return min;
    }

}
 /*
    Map - Min value
Write a method that can return the minimum value from a map
(DO NOT use sort method).
     */