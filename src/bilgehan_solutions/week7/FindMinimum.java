package bilgehan_solutions.week7;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6} ;
        int[] arr2 = {99, 12, 23, 32, 44, 57, 6, 89, -3 , -7, 8} ;

        System.out.println(findMinimum(arr));
        System.out.println(findMinimum(arr2));

    }

    public static int findMinimum (int[] arr) {

        int min = arr[0] ;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i] ;
            }
        }
        return min ;
    }
}
    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */