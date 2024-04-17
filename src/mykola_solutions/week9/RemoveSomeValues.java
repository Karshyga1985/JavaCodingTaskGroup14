package mykola_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4,101,102,103,104, 5, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4,101,102,103,104, 5, 6));
        System.out.println(list);
        System.out.println(list2);
        removeGreaterThen100(list);
        removeGreaterThen1002(list2);
        System.out.println(list);
        System.out.println(list2);
    }

    public static void removeGreaterThen100(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next() > 100){
                it.remove();
            }
        }
    }

    public static void removeGreaterThen1002(List<Integer> list){
        list.removeIf(p -> p > 100);
    }

}
