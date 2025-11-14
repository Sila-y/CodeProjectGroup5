package mohammad.week1;

public class Task3_SwapNumbers {
    public static void main(String[] args) {

        /*
        Numbers - Swap Numbers
    Swap two variables' values without using a third variable.
         */

        int a = 3;
        int b = 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swapNumbers(a, b);
    }

    public static void swapNumbers(int a, int b) {

        a = a + b;  //          3+6 = 9

        b = a - b;  //          9-6 = 3

        a = a - b;  //          9-3 = 6

        System.out.println("After swap:  a = " + a + ", b = " + b);
    }
}
