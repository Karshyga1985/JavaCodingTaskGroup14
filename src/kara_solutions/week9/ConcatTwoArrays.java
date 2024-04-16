package kara_solutions.week9;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9 ,10};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));

        String[] arr3 = {"Khusan", "Eren", "Mykola", "Talha"};
        String[] arr4 = {"Bilge", "Dilya", "Christine", "Adri" , "Nazik"};
        System.out.println(Arrays.toString(concatTwoArrays(arr3, arr4)));

        char[] arr5 = {'a', 'b', 'c', 'd'};
        char[] arr6 = {'e', 'f', 'g', 'h' , 'i'};
        System.out.println(Arrays.toString(concatTwoArrays(arr5, arr6)));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++, k++){
            arr3[k] = arr1[i];
            }
        for(int i = 0; i < arr2.length; i++, k++){
            arr3[k] = arr2[i];
        }
        return arr3;
        }

    public static String[] concatTwoArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++, k++){
            arr3[k] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++, k++){
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static char[] concatTwoArrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++, k++){
            arr3[k] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++, k++){
            arr3[k] = arr2[i];
        }
        return arr3;
    }

}
 /*
    1) Array - Concat two arrays
    Write a return method that can concate two arrays
     */