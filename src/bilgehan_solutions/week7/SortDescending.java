package bilgehan_solutions.week7;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1,9,10, 9, 8, 7,11,-1};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }
    public static int[] sortDescending(int[] arr){
       int temp = 0 ;

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }

      return arr ;
    }

}
   /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */