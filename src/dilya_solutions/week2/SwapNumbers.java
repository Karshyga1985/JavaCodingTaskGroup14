package dilya_solutions.week2;

public class SwapNumbers {
    //Swap two variables' values without using a third variable
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        a = a+b; //a=7
        b = a-b; //b=3
        a -= b;  //a=4


        System.out.println("a: " + a + " b: " + b);
    }
}
