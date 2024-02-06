package kara_solutions.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 20;
        int y = 15;

        System.out.println("Before swapping: ");
        System.out.println("x = " + x);// x = 20
        System.out.println("y = " + y);// y = 15

        x = x + y;// 20 + 15 = 35
        y = x - y;// 35 - 15 = 20
        x = x - y;// 35 - 20 = 15
        System.out.println("After swapping: ");
        System.out.println("x = " + x);// x = 15
        System.out.println("y = " + y);// y = 20

    }
}
  /*
    Swap two variable' values without using a third variable
     */