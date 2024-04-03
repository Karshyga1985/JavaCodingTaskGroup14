package first_week_tasks;

public class DilyaFirstWeekTasks {
    //Main
    public static void main(String[] args) {

        identify(3);
        identify(4);
        identify(0);

        divide2nums(2, 4);

        FINRA();

    }
    /*  Task 1
    Numbers -- odd & even
    Write a method which can identifies given number is even or odd */

    public static void identify(int n){
        if(n==0){
            System.out.println("Zero");
        }
        else if(n%2==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    /*  Task 2
    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator */
    public static void divide2nums(int a, int b){
        int c = 0;
        while(a>=b){
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

    /*  Task 3
    FINRA:
    Write a method which prints out the numbers from  1 to 30 but for numbers which are a multiple of 3 print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number. */

    public static void FINRA(){
        for(int i = 0; i < 31; i++){
            if(i%15==0){
                System.out.println("FINRA");
            }
            else if(i%3==0){
                System.out.println("FIN");
            }
            else if(i%5==0){
                System.out.println("RA");
            }
            else {
                System.out.println(i);
            }
        }

    }


}
