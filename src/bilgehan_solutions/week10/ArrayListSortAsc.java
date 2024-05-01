package bilgehan_solutions.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSortAsc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 9,-9, 7, 10, 5, 3, 8, 8, -15,6,0));
        System.out.println(ascendingList(list));
        System.out.println(ascendingList2(list));
    }

    public static ArrayList<Integer> ascendingList(ArrayList<Integer> list){

        int temp = 0 ;

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1; j++) {
               if (list.get(j) > list.get(j+1)) {
                   temp = list.get(j);
               list.set(j, list.get(j+1));
              list.set(j+1, temp);
               }
            }
        }
        return list;
    }
    public static ArrayList<Integer> ascendingList2(ArrayList<Integer> list){

        int temp = 0 ;

            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j) > list.get(j+1)) {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }

        return list;
    }
}
