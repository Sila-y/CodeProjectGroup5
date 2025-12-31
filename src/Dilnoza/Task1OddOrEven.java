package Dilnoza;

public class Task1OddOrEven {

     /*
    QUESTION 1 -Numbers --Odd & Even:
    Write a method which can identify if a given number odd or even

    Ex:
    identify(5) --> "Odd"
    identify(6) --> "Even
     */

    public static void oddOrEven (int number){
        if(number % 2 == 0){
            System.out.println("Number is even: " + number);
        }else if(number % 2 != 0){
            System.out.println("Number is odd: " + number);
        }else{
            System.out.println("Number is: " + number);
        }
    }

    public static void main(String[] args) {

        oddOrEven(0);

    }

}