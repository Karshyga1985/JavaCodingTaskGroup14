package christine_solutions.week7;

public class FindMinimum {
    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static int min(int[] arr){

        int minNum = arr[0];

        for (int each : arr) {
            if (each < minNum){
                minNum = each;
            }
        }

        return minNum;
    }

    public static void main(String[] args) {

        int[] num = {1, 24, 5, -6, 8};
        int[] num2 = {-1, 36, 0, -89, 102};
        int[] num3 = {-1, -23, -111, -54};

        System.out.println("min(num) = " + min(num));
        System.out.println("min(num2) = " + min(num2));
        System.out.println("min(num3) = " + min(num3));

    }
}
