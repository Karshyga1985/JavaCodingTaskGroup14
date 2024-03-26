package bilgehan_solutions.week6;

public class FindMaximum {
    public static void main(String[] args) {
        int [] arr = {1,6,9,4,2,78,65,84,2};
        System.out.println(maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        int max = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i] ;
            }
        }
        return max ;
    }

}
   /*
    2-Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */