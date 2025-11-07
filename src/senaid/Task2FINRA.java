package senaid;

public class Task2FINRA {

    public static void main(String[] args) {


        /*
   Write a Java method that follows these rules:

  Print all numbers from 1 to 30.

  For numbers that are multiples of 3, print "FIN" instead of the number.

  For numbers that are multiples of 5, print "RA" instead of the number.

  For numbers that are multiples of both 3 and 5, print "FINRA" instead of the number.
     */

        finra();

    }


    public static void finra() {


        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
