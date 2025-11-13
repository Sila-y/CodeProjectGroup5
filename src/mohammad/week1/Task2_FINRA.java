package mohammad.week1;

public class Task2_FINRA {
    public static void main(String[] args) {

        FinRa();


    }

    public static void FinRa () {

    /* Write a Java method that follows these rules:
        Print all numbers from 1 to 30.
        For numbers that are multiples of 3, print "FIN" instead of the number.
        For numbers that are multiples of 5, print "RA" instead of the number.
        For numbers that are multiples of both 3 and 5, print "FINRA" instead of the number. */

        for (int j = 1; j <=30; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println("FINRA");
            } else if (j % 3 == 0) {
                System.out.println("FIN");
            } else if (j % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(j);
            }
        }
    }
}
