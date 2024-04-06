package eren_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
  /*
    2) ArrayList - Remove "Ahmed"
    Given a list of people's names: "Ahmed", "John", Eric", "Ahmed"...
    Write a java operation to remove all the names named Ahmed
     */


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));
        System.out.println(removeAhmed(names));

    }

    public static List<String> removeAhmed(List<String> names){
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        return names;
    }

    public static List<String> removeAhmed2(List<String> names) {
        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }

}
