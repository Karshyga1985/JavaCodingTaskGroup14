package Adri_Solutions.Week9Solutions;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAhmed {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(){{add("Ahmed");add("Ahmed");add("Judy");add("Frank");add("Maria");add("Ahmed");add("Luis");add("Ahmed");}};

        System.out.println(removeName(names, "Ahmed"));
    }

    public static ArrayList<String> removeName (ArrayList<String> arr ,String name){
        Iterator itr = arr.iterator();
       while (itr.hasNext()){
           String removable = (String)itr.next();
           if (removable.equalsIgnoreCase(name)){
               itr.remove();
           }


       }
       return arr;
    }
}
//` 2) ArrayList - Remove "Ahmed"
//Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
//Write a java operation to remove all the names named Ahmed