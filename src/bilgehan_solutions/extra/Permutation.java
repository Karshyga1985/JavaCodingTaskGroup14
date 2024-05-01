package bilgehan_solutions.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Map<Integer, Integer>> list = new ArrayList<>();
        ArrayList<Map<Integer, Integer>> list2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Map<Integer, Integer> maps = new LinkedHashMap<>();
            for (int j = 0,k=arr.length-1; j < arr.length; j++,k--) {
              if(arr[k] !=arr[i]){
                  maps.put(arr[k] , arr[i]);
              }
            } list.add(maps);
        }
        System.out.println(list);

    }
}
//    Given an array of 3 characters print all permutation combinations from the given
//        characters