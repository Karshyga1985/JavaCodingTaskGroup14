package khusan_solutions.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistAscOrder {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(32,3, 56,76,12,33, 67,-12));

        System.out.println(sortingArraylistAsc(arrayList));

    }

    public static ArrayList<Integer> sortingArraylistAsc(ArrayList<Integer> arrayList){
        int temp;
        for (int i = 0; i < arrayList.size(); i++) {


            for (int j = i+1; j < arrayList.size(); j++) {

                if(arrayList.get(i) > arrayList.get(j)){
                    temp= arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }

        }
        return arrayList;
    }

}

/*
    Write a method that can sort the ArrayList in ascending order without
    using the sort method.
 */