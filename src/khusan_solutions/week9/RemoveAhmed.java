package khusan_solutions.week9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {

    public static void main(String[] args) {

        String[] array = {"Ahmed", "John", "Eric", "Ahmed", "Smith", "Eric", "Ahmed", "Jack", "Christine", "Ahmed"};

        System.out.println("Removing Ahmed:" + removeName(array, "Ahmed"));
        System.out.println("Removing Eric:" + removeName(array, "Eric"));



    }

    public static ArrayList<String> removeName(String[] array, String name){

        ArrayList<String> names = new ArrayList<>(Arrays.asList(array));
        //System.out.println(names);

        names.removeIf(p -> p.equals(name));

        return names;
    }
}

/*
    2) ArrayList - Remove "Ahmed"
    Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
