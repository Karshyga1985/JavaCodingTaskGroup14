package mykola_solutions.week1;

public class Finra {
    public static void finra(){
        for(int i = 1; i < 31; i++ ){
            if (i % 15 == 0){
                System.out.println("FINRA");
            } else if (i % 3 == 0){
                System.out.println("FIN");
            }else if (i % 5 == 0){
                System.out.println("RA");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void finra2(int number){
        for(int i = 1; i <= number; i++){
            String str = "";
            if (i % 3 == 0){
                str += "FIN";
            }
            if (i % 5 == 0){
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
        }
    }

    public static void OddOrEven ( int number) {

        if (number % 2 == 0 && number != 0) {
            System.out.println(number + ", is an even number");

        } else if (number % 2 != 0) {
            System.out.println(number + ", is an odd number");

        } else {
            System.out.println("Equals to zero");
        }
    }
    public static void main(String[] args) {

        finra();
        System.out.println("------------------------------------------");
        finra2(30);
        OddOrEven(2);

    }

}
