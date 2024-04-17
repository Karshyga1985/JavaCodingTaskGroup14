package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortingInDESC {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 25, 1, 3, 45, -6));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-56, -65, 1, 0, 3, -96, 70));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(800, 20, 30, 12, 57, 60, 7, -80, 13, 100, -5, 200, 56));
        System.out.println(sortDesc(list));
        System.out.println(sortDesc(list1));
        System.out.println(sortDesc(list2));
    }

    public static ArrayList<Integer> sortDesc(ArrayList<Integer> list){
        for(int i = 0; i < list.size()-1; i++){
            int maxNInd = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j) > list.get(maxNInd)){
                    maxNInd = j;
                }
            }
            int temp = list.get(maxNInd);
            list.set(maxNInd, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    /*
        Write a method that can sort the ArrayList in descending order without
    using the sort method.
     */
}
