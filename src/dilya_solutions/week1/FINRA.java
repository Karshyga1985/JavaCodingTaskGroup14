package dilya_solutions.week1;

public class FINRA {
    public static void finRA(){
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
