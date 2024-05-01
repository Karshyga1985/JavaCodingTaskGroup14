package mykola_solutions.week10;

import java.util.*;

public class SortingListDESC {

    public static List<Integer> sortDESC(List<Integer> list){

        List<Integer> result = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            result.add(Collections.max(list));
            list.removeIf( p -> p == Collections.max(list));
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(800, 20, 30, 12, 57, 60, 7, -80, 13, 100, -5, 200, 56));
        System.out.println(list2);
        System.out.println("sortDESC(list2) = " + sortDESC(list2));
    }

   /*
        Write a method that can sort the ArrayList in descending order without
    using the sort method.
     */
}
