package mounir;

public class Task1OddOrEven {
    // write a method which can identify if a number is odd or even

    public static void checkNumbers(int number){
        if (number % 2 == 0 ){
            System.out.println(number + "  is even number");
        }else{
            System.out.println(number + "  is odd number");
        }
    }

    public static void main(String[] args) {
        checkNumbers(5);
        checkNumbers(6);
    }
}
