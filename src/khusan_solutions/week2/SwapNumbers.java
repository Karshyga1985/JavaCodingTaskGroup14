package khusan_solutions.week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 15;
        int b = 25;

        System.out.println("before swapping - a: " + a);
        System.out.println("before swapping - b: " + b);
        a = a + b; // a = a+b = 40

        b = a - b; // b = 40-25 = 15
        a = a - b; // a = 40-15 = 25

        System.out.println("------------------------");
        System.out.println("after swapping - a: " + a);
        System.out.println("after swapping - b: " + b);


    }



}

/*
    Swap two variable's values without using a third variable

 */