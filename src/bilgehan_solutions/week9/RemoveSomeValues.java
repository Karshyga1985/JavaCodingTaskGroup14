package bilgehan_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,88,65,47,25,3,96,47));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,88,65,47,25,3,96,47));
        System.out.println(removeSome(list));
        System.out.println(removeSome2(list));
        removeSome3(list2);
        System.out.println(list2);

    }

    public  static ArrayList<Integer> removeSome(ArrayList<Integer> list){

        list.removeIf(p-> p<50);
        return list;
    }
    public  static ArrayList<Integer> removeSome2(ArrayList<Integer> list){
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            if(it.next()<50){
                it.remove();
            }
        }

        return list ;
    }
    public  static void removeSome3(ArrayList<Integer> list){
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            if(it.next()<50){
                it.remove();
            }
        }


    }
}
 /*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */