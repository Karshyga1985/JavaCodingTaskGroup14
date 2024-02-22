package nazik_solutions.week1;
public class Finra {

    public static void main(String[] args) {
        finra(30);

        finra2(25);
    }

    public static void finra(int n){

        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){ // % 3 and % 5
                System.out.println("FINRA");
            } else if(i % 3 == 0){
                System.out.println("FIN");
            } else if(i % 5 == 0){
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void finra2(int n){

        for(int i = 1; i <= n; i++){

            String str = "";

            if(i % 3 == 0){
                str += "FIN";
            }

            if(i % 5 == 0){
                str += "RA";
            }

            System.out.println(str.isEmpty() ? i : str);
            // if(str.isEmpty()){
            // System.out.println(i);
           // } else {
            //   System.out.println(str);
           // }
        }
    }
}
/*
FINRA:

Write a method which prints out the numbers from  1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are
a multiple of 5, print "RA" instead of the number. For numbers which are a
multiple of both 3 and 5, print "FINRA" instead of the number.

 */