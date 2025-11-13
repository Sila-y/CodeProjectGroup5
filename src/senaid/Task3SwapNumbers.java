package senaid;

public class Task3SwapNumbers {

        /*

    Numbers - Swap Numbers
    Swap two variables' values without using a third variable.

     */

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Before swap a = " + a + ", b = " + b);

        // Swap using arithmetic
        a = a + b; //10 + 5 = 15
        b = a - b; //15 - 5 = 10
        a = a - b;

        System.out.println("After swap a = " + a + ", b = " + b);



    }


}
