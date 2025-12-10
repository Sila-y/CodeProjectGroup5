package Sila;

public class Task4ReturnMethod {
    /*
    Task 4
  Write a return method that can reverse digits of a negative number and return it as int
     */
    
        public int reverse ( int num){
            int reversed = 0;
            int sign = num < 0 ? -1 : 1;
            num = Math.abs(num);

            while (num != 0) {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }

            return reversed * sign;


        }




}
