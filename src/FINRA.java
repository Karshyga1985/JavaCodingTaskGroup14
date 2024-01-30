public class FINRA {

    public static void main(String[] args) {


        for (int i = 1; i < 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) { // This line will write me multiple of 3, and print "FIN" instead of the given number.
                System.out.print("FIN ");
            } else if (i % 5 == 0) { // This line will write me multiple of 5, and print "RA" instead of the given number.
                System.out.print("RA ");
            } else {
                System.out.print(i + " "); // This line will write me if the number is multiple of 3 and 5 together, it will print me "FINRA" instead of the given number.

            }
        }

    }

}

/*
FINRA:
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are
a multiple of 5, print "RA" instead of the number. For numbers which are a
multiple of both 3 and 5, print "FINRA" instead of the number.*/