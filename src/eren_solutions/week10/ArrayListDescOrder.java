package eren_solutions.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDescOrder {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(39,45,59,-3,5,90,13,-27,67,83,91));

        System.out.println(sortingArraylistDesc(arrayList));

    }

    public static ArrayList<Integer> sortingArraylistDesc(ArrayList<Integer> arrayList){
        int temp;
        for (int i = 0; i < arrayList.size(); i++) {


            for (int j = i+1; j < arrayList.size(); j++) {

                if(arrayList.get(i) < arrayList.get(j)){
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
    Write a method that can sort the ArrayList in descending order without
    using the sort method.
 */

