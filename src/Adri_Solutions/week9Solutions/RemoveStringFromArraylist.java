package Adri_Solutions.week9Solutions;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveStringFromArraylist {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(){{add("Ahmed");add("Ahmed");add("Judy");add("Frank");add("Maria");add("Ahmed");add("Luis");add("Ahmed");}};

        System.out.println(removeName(names, "Ahmed"));
    }

    public static ArrayList<String> removeName (ArrayList<String> arr ,String name) {
        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            String removable = (String) itr.next();
            if (removable.equalsIgnoreCase(name)) {
                itr.remove();
            }
        }
        return arr;
    }
}
