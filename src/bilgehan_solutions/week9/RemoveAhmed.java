package bilgehan_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {

       ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

      System.out.println(removeStr(list));
        System.out.println(removeStr2(list));
    }
 public static ArrayList<String> removeStr(ArrayList<String> list){
        list.removeIf(p-> p.equals("Ahmed"));
        return list;
 }
    public static ArrayList<String> removeStr2(ArrayList<String> list){

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().equals("Ahmed")){
             it.remove();
            }
        }


        return list;
    }
}
/*
    2) ArrayList - Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */