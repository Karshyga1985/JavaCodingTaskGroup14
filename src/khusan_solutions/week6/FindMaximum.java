package khusan_solutions.week6;

public class FindMaximum {

    public static void main(String[] args) {

        System.out.println(maxDigit(new int[]{19, 10, 6, 9, 27, 23}));

        int[] array = {19,10,6,91,27,23};
        System.out.println(maxDigit(array));


    }
    public static int maxDigit(int[] array){

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /*
    2-Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */
}
