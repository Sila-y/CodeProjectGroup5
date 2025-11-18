package bahlul;

public class Task3SwapNumbers {

    public static void main(String[] args) {

          /*

    Numbers - Swap Numbers
    Swap two variables' values without using a third variable.

     */

        int a = 3;
        int b = 7;

        b=b-a; //b=4
        a=b+a; //a=7
        b=a-b;

        System.out.println("a variable: "+ a);
        System.out.println("b variable: "+ b);



    }
}
