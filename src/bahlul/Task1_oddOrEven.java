package bahlul;

public class Task1_oddOrEven {

    public static void main(String[] args) {


        int number = 10;

        System.out.println(identify(number));
        System.out.println(identify(1));
        System.out.println(identify(0));


    }


    public static String identify(int num){

        if(num%2!=0){
            return "Odd";
        }

        return "Even";
    }

}
