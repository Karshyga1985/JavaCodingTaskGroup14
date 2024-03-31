package dilya_solutions.week7;

public class FindMin {
    public static int findMin(int[]arr){
        int min = arr[0];
        for(int num : arr){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
    public static void findMin2(int[]arr){
        int min = arr[0];
        for(int num : arr){
            if(num<min){
                min = num;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(findMin(arr));
        findMin2(arr);
    }
}
