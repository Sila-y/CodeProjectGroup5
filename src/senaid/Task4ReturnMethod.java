package senaid;

public class Task4ReturnMethod {


    public static void main(String[] args) {
        /*
    Task 4
  Write a return method that can reverse digits of a negative number and return it as int
     */

        System.out.println(reverseNegative(-356));




//        int m = -356 % 10;
//        System.out.println("m = " + m);
//
//
//        int n = -356 / 10;
//        System.out.println("n = " + n);
//
//        n = -35 / 10;
//        System.out.println("n = " + n);
//
//        n = -3 / 10;
//        System.out.println("n = " + n);


    }

    public static int reverseNegative(int num){
        int reversed = 0;

       while (num < 0){

           int digit = num % 10; //to get last number 123 % 10 = 3
           reversed = reversed * 10 + digit;
           num /= 10;

       }


        return reversed;

    }


}
