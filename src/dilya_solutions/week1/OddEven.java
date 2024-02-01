package dilya_solutions.week1;

public class OddEven {
    public static void identify(int n){
        if(n==0){
            System.out.println("Zero");
        }
        else if(n%2==1 || -n%2==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    public static void main(String[] args) {
        identify(-4);
        identify(3);
        identify(0);
    }
}
