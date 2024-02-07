package khusan_solutions.week2;

public class DivisibleBy3And5And15 {

    public static void main(String[] args) {

        DivisibleBy3And5And15(100);
        System.out.println("==========================");
        DivisibleBy3And5And15(50);

    }

    public static void DivisibleBy3And5And15(int num) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i < num; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                divisibleBy15 += i + " ";
                //System.out.print("Divisible by 15 "+ i);
            } else if (i % 5 ==0){
                divisibleBy5 += i + " ";
                //System.out.print("Divisible by 5 "+ i);
            } else if(i % 3 == 0){
                divisibleBy3 += i + " ";
                //System.out.print("Divisible by 3 "+ i);
            }
        }
        System.out.println("Divisible by 15 : "+ divisibleBy15);
        System.out.println("Divisible by 5  : "+ divisibleBy5);
        System.out.println("Divisible by 3  : "+ divisibleBy3);
    }
}


/*
Write a program that can print the numbers between 1 - 100 that can be divisible by 3, 5, and 15.
       if the number can be divisible by 3, 5, and 15, then it should only be displayed in DivisibleBy15' section.
       if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section.
       if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section.
    ex:
       OutPut:
          Divisible By 15: 15 30 45 60 75 90
          Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
          Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */