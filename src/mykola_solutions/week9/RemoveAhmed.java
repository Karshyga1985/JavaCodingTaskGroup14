package mykola_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
/*
Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(list);
        System.out.println(list2);
        removeAhmad(list);
        removeAhmadWithIterator(list2);
        System.out.println(list2);
        System.out.println(list);

    }

    public static void removeAhmad(List<String> list){

        list.removeIf(p -> p.equals("Ahmed"));
    }

    public static void removeAhmadWithIterator(List<String> list){
        Iterator<String> it =  list.iterator();
       while (it.hasNext()){
           if (it.next().equals("Ahmed")){
               it.remove();
           }
       }

    }


}
