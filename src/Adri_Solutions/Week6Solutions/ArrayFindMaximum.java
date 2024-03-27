package Adri_Solutions.Week6Solutions;

public class ArrayFindMaximum {

    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,8};
        System.out.println(maxElement(arr));
    }

    public static int maxElement(int[] arr){
        int maxNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxNum){
                maxNum=arr[i];
            }
        }
        return maxNum;
    }
}

//2-Array -- Find Maximum
//Write a method that can find the maximum number from an int Array