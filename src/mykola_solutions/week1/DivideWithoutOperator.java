package mykola_solutions.week1;

public class DivideWithoutOperator {

    public static String divide(double number, double divideBy){
        if (divideBy == 0){
            throw new RuntimeException("Cant divide by 0!!");
        }
        String result = number+" / "+ divideBy+ " is ";
        int count = 0;
        while (number >= divideBy){
            count++;
            number -= divideBy;
        }
        return result+count+" end remainder is "+number;


    }

    public static void main(String[] args) {
        System.out.println(divide(3,5));
        System.out.println(divide(8,3));
        System.out.println(divide(10,3));
        System.out.println("-----------------------------");
        System.out.println(divide2(3,5));
        System.out.println(divide2(8,3));
        System.out.println(divide2(6,2));

    }
    public static String divide2(int number, int divideBy ){
        if(divideBy == 0){
            throw new RuntimeException("Can not divide by 0!!");
        }
        String result = number+" / "+ divideBy+" is ";
        int count = 0;
        while (number >= divideBy){
            count++;
            number -= divideBy;
        }
        return result + count + " with remainder of "+number;


    }



}
