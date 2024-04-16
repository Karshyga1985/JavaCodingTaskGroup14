package kara_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveAhmed {

    public static void main(String[] args) {
        ArrayList<String> listOfName = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Kara", "Burkhan", "Salma"));
//        listOfName.removeIf(p -> p.equals("Ahmed"));
//        System.out.println(listOfName);
        System.out.println("removeAhmed(listOfName) = " + removeAhmed(listOfName));
        System.out.println("removeAhmed(listOfName) = " + removeAhmed1(listOfName));
        System.out.println("removeAhmed(listOfName) = " + removeAhmed2(listOfName));

        ArrayList<String> listOfName1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Kara",
                "Burkhan", "Salma", "Ahmed", "Mike", "Lola", "Ahmed", "Ahmed", "Sally", "Festine"));
        System.out.println("removeAhmed1(listOfName1) = " + removeAhmed1(listOfName1));


    }
    public static ArrayList<String> removeAhmed(ArrayList<String> list){
        ArrayList<String> temp = new ArrayList<>(list);// to avoid ConcurrentModificationException
        for (String eachName : temp) {
            if(eachName.equals("Ahmed")){
                list.remove(eachName);
            }
        }
        return list;
    }

    public static ArrayList<String> removeAhmed1(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("Ahmed")){
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }

    public static ArrayList<String> removeAhmed2(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.equals("Ahmed")){
                iterator.remove();
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