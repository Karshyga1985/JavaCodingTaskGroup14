package dilya_solutions.week1;

public class divideNumbers {
    public static void divide2nums(int a, int b){
       int c = 0;
       while(a>=b){   //this condition is necessary because we need the first number to be the dividend and the second number the divisor
           a -= b;
           c++;
       }
        if(a >= b) {
            System.out.println("Result: " + c + ", remainder: " + a);
        }
        else{
            System.out.println("First number must be greater than second number");
        }
    }
}
