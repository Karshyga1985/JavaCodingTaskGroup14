package mykola_solutions.week7;

public class FindMinimum {

    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */


        public static int findMin(int[] arr) {
            int min;
            if (arr.length == 0) {
                return 0;
            } else {
                min = arr[0];
                for (int each : arr) {
                    if (min > each) {
                        min = each;
                    }
                }
            }

            return min;
        }



    public static void main(String[] args) {

        int[] arr = {200, 1, 2, 3, 4, 5, -6, 100};
        int num = findMin(arr);
        System.out.println(num);

    }





}
