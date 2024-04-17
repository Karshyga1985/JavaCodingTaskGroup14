package dilya_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrList_RemoveAhmed {

    public static ArrayList<String> removeAhmed(ArrayList<String> names){
        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }
    public static void removeAhmed2(ArrayList<String> names){
        names.removeIf(p -> p.equals("Ahmed"));
        System.out.println(names);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        System.out.println(removeAhmed(names));
        removeAhmed2(names);
    }
}
