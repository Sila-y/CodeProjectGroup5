package Shakhrom;

public class Task3_SwapNumbers {


    public static void swap(int a, int b) {
        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10

        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swap(2, 3);
    }
}

    /*
    Numbers - Swap Numbers
    Swap two variables' values without using a third variable.
     */
