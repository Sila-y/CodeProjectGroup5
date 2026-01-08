package Shakhrom;

public class Task4_ReturnMethod {


    public static int reverseNegative(int number) {
        int reversed = 0;
        int num = Math.abs(number);

        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }

        return number < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-788));
        System.out.println(reverseNegative(-10));
    }

}

     /*
    Task 4
    Write a return method that can reverse digits of a negative number and return it as int
     */

