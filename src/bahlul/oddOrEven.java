package bahlul;

public class oddOrEven {

    // first week
    public static void main(String[] args) {


        int number = 10;

        System.out.println(oddOrEven(number));
        System.out.println(oddOrEven(1));
        System.out.println(oddOrEven(0));


    }


    public static String oddOrEven(int num){

        if(num%2!=0){
            return "Odd";
        }

        return "Even";
    }
}
