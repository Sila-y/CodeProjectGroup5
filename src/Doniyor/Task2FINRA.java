package Doniyor;

public class Task2FINRA {

    public static void printFINRA(){
        for (int i = 1; i <= 30 ; i++) {
            if(i % 15 == 0){
                System.out.print("FINRA" + "\t");
            }else if(i % 5 == 0){
                System.out.print("RA" + "\t");
            }else if(i % 3 == 0){
                System.out.print("FIN" + "\t");
            }else {
                System.out.print(i + "\t");
            }
        }
    }
    public static void main(String[] args) {

        printFINRA();
    }

}
