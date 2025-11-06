package mohammad.week1;

public class Task1_OddOrEven {

     /*
    QUESTION 1 -Numbers --Odd & Even:
    Write a method which can identify if a given number odd or even

    Ex:
    identify(5) --> "Odd"
    identify(6) --> "Even
     */

    public static String identifyNum(int number) {
        if (number % 2 == 1) {
            return number + " - is Odd nummber";
        }else {
            return number + " - is Even number";
        }
    }


    public static void main(String[] args) {

        System.out.println(identifyNum(5));
        System.out.println(identifyNum(6));
    }



}
