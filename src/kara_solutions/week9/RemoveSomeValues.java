package kara_solutions.week9;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveSomeValues {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(52);
        list.add(152);
        list.add(215);
        list.add(-2);
        list.add(0);
        list.add(100);
        System.out.println("removeSomeValues(list) = " + removeSomeValues(list));
        System.out.println("removeSomeValues1(list) = " + removeSomeValues1(list));
        System.out.println("removeSomeValues1(list) = " + removeSomeValues2(list));
    }


    public static ArrayList<Integer> removeSomeValues(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            if(value > 100){
                iterator.remove();
            }
        }
        return list;
    }

    public static ArrayList<Integer> removeSomeValues1(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer eachValue : temp) {
            if(eachValue > 100){
                list.remove(eachValue);
            }
        }
        return list;
    }

    public static ArrayList<Integer> removeSomeValues2(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > 100){
                list.remove(list.get(i));
            }
        }
        return list;
    }

}
  /*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */