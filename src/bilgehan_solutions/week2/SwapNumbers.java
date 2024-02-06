package bilgehan_solutions.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 8 ;
        int b = -5 ;
        a = a+b ;
        b= a-b ;
        a = a-b ;

        System.out.println(a + " " + b);

        swapNumbers(9, -8);
    }

    public static void swapNumbers (int a , int b) {

        a= a+b ;
        b = a-b ;
        a= a-b ;

        System.out.println(a + " " + b );


    }
}
/*
    Swap two variable' values without using a third variable
     */