package Adri_Solutions.Week9Solutions;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveSomeValuesArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(){{add(2);add(101);add(76);add(200);add(8);add(98);add(150);add(240);}};

        System.out.println(removeSomeValues(numbers, 100));
    }

    public static ArrayList<Integer> removeSomeValues (ArrayList<Integer> arr , int x){
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
            Integer removable = (Integer)itr.next();
            if (removable>x){
                itr.remove();
            }


        }
        return arr;
    }
}
