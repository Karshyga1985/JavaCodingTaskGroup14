package mykola_solutions.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListASC {

    public static List<Integer> sortASC(List<Integer> list){

        List<Integer> result = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            result.add(Collections.min(list));
            list.removeIf( p -> p == Collections.min(list));
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(800, 20, 30, 12, 57, 60, 7, -80, 13, 100, -5, 200, 56));
        System.out.println(list2);
        System.out.println("sortASC(list2) = " + sortASC(list2));
    }

     /*
        Write a method that can sort the ArrayList in Ascending order without using
    the sort method.
     */
}
