package mykola_solutions.week1;

public class OddOrEven {


    public static String identify(int number){
        if (number % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
    public static String identify2(int number){
        return number % 2 == 0 ? "Even": "Odd";

    }

    public static void main(String[] args) {
        System.out.println(identify(0));
        System.out.println(identify2(6));


    }



}
