package khusan_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
    public static void main(String[] args) {

        int[] ints = {12, 432, 45, 567, 23, 555, 67, 333, 78, 111};

        System.out.println(removeValues(ints));

    }

    public static List<Integer> removeValues(int[] ints){

        List<Integer> int_List = new ArrayList<Integer>(ints.length);

        for (int eachNumber : ints) {
            int_List.add(eachNumber);
        }

        int_List.removeIf(p -> p > 100);

        return int_List;
    }

}


/*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */