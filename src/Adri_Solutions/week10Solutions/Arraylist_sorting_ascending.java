package Adri_Solutions.week10Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_sorting_ascending {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(36);
        list.add(78);
        list.add(23);
        list.add(67);
        list.add(45);
        list.add(43);
        list.add(90);

        System.out.println(sortAsc(list));


    }


    public static ArrayList<Integer> sortAsc(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                    int TempI = list.get(i);
                    int TempJ = list.get(j);

                if (TempI > TempJ) {
                    list.set((i), TempJ);
                    list.set((j), TempI);

                }

            }
        }
       return list;
    }

}


/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
 */
