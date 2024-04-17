package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingInASC {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 25, 1, 3, 45, -6));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-56, -65, 1, 0, 3, -96, 70));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(800, 20, 30, 12, 57, 60, 7, -80, 13, 100, -5, 200, 56));
        System.out.println(sortAsc(list));
        System.out.println(sortAsc(list1));
        System.out.println(sortAsc(list2));

    }
    public static ArrayList<Integer> sortAsc(ArrayList<Integer> list){
        for(int i = 0; i < list.size()-1; i++){
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j) < list.get(minIndex)){
                    minIndex = j;
                }
            }
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    /*
        Write a method that can sort the ArrayList in Ascending order without using
    the sort method.
     */
}
