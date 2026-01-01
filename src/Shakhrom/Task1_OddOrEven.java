package Shakhrom;

public class Task1_OddOrEven {

    public static String oddOrEven_method(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven_method(50)); // Odd
        System.out.println(oddOrEven_method(91)); // Even
    }


}

    /*
    QUESTION 1 -Numbers --Odd & Even:
    Write a method which can identify if a given number odd or even

    Ex:
    identify(5) --> "Odd"
    identify(6) --> "Even
     */

