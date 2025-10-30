package senaid;

public class oddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(-6));

        System.out.println(identifyNum(7));
        System.out.println(identifyNum(8));


    }

    public static String identify(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return number + " is Even number";
            } else {
                return number + " is Odd number";
            }
        }else {
            return "Number cannot be 0 or negative!";
        }

    }

    public static String identifyNum(int number){

        return number % 2 == 0 ? number + " is Even number": number + " is Odd number";
    }

}
    /*
    QUESTION 1 -Numbers --Odd & Even
    Write a method which can identify if a given number odd or even

    Ex:
    identify(5) --> "Odd"
    identify(6) --> "Even
     */