package mykola_solutions.week2;

public class SwapNumbers {
    /*
    Swap two variable' values without using a third variable
     */
    public static void main(String[] args) {
        int x = 50;
        int y = 30;

        y += x;
        x = y - x;
        y -= x;
        System.out.println("y = " + y);
        System.out.println("x = " + x);


        //String str0 = "Pineapple";
        String str = "Apple";
        String str2 = "Pen";

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        str += str2;
        str2 = str.substring(0,str.length()-str2.length());
        str = str.replace(str2,"");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);



    }
}
