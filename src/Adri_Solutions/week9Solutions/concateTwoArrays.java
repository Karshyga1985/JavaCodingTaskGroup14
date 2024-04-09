package Adri_Solutions.week9Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class concateTwoArrays {

    public static void main(String[] args) {
        String[] array1 = {"name", "birthday", "age", "country"};
        String[] array2 = {"lastname", "birthplace", "address", "zip"};

        System.out.println(Arrays.toString(ConcateTwoarrays(array1,array2)));
    }

    public static String[] ConcateTwoarrays (String[] first, String[] second){
        List<String> both = new ArrayList<String>(first.length + second.length);
        Collections.addAll(both,first);
        Collections.addAll(both,second);
        return both.toArray(new String[both.size()]);
    }

}
//1) Array - Concat two arrays
//Write a return method that can concate two arrays