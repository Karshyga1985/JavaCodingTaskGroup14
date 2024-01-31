package first_week_tasks;

public class AdriFirstWeekTasks {

    public static void oddOrEven(int num){

        if (num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }

    public static int DivideWithoutOperator(int num1, int num2){
        int sum=0;
        while(num1>=num2){
            num1-=num2;
            sum++;
        }
        return sum;
    }

    public static void FINRA(int num){

        for (int i = 0; i <= num ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 3==0) {
                System.out.println("FIN");
            } else if (i % 5==0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }
    }

}
