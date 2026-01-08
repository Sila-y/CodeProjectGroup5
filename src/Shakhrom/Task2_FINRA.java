package Shakhrom;

public class Task2_FINRA {

    public static void printFinRa() {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFinRa();
    }

}

/*
   Write a Java method that follows these rules:

  Print all numbers from 1 to 30.

  For numbers that are multiples of 3, print "FIN" instead of the number.

  For numbers that are multiples of 5, print "RA" instead of the number.

  For numbers that are multiples of both 3 and 5, print "FINRA" instead of the number.
     */
