package first_week_tasks;

import java.util.ArrayList;

public class Bilgehan_First_Week_Task {
    public static void main(String[] args) {
        identify(9);
        finRa(30);
        System.out.println();
        System.out.println(divideWithNoOperator(10, 3));

    }

    public static void identify(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int divideWithNoOperator(int a , int b) {

        int count  = 0 ;


        while (a>= b) {
            a -= b ;
            count ++ ;
        }
        return count ;
    }



    public static void finRa(int num) {
        ArrayList<Integer> nums = new ArrayList<>() ;


        for (int i = 1; i <=num ; i++) {
            nums.add(i) ;
        }

        for (Integer each : nums) {
            if (each % 3==0  && each %5==0){
                System.out.print("FINRA" + " ");
            }else if(each %3 == 0){
                System.out.print("FIN" + " ");
            }else if (each % 5== 0){
                System.out.print("RA" + " ");
            } else {
                System.out.print(each + " ");
            }
        }


    }

}


