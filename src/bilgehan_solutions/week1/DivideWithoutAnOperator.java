package bilgehan_solutions.week1;

public class DivideWithoutAnOperator {
    public static int divideWithNoOperator(int a , int b) {

        int count  = 0 ;
        while (a>= b) {
            a -= b ;
            count ++ ;
        }
        return count ;
    }


}
