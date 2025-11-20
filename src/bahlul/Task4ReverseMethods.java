package bahlul;

public class Task4ReverseMethods {

        public static void main(String[] args) {

            int ex1 = -1234;
            int ex2 = -6844;
            int ex3 = -9876;
            int ex4 = 123;   // also works with positive!

            System.out.println(reverse(ex1)); // → -4321
            System.out.println(reverse(ex2)); // → -4486
            System.out.println(reverse(ex3)); // → -6789
            System.out.println(reverse(ex4)); // → 321
        }

        public static int reverse(int num) {
            // Handle the sign separately
            boolean isNegative = num < 0;
            String str = String.valueOf(Math.abs(num));  // get digits without sign

            StringBuffer sb = new StringBuffer(str);
            sb.reverse();

            // Convert back to int
            int result = Integer.parseInt(sb.toString());

            // Re-apply the negative sign if needed
            return isNegative ? -result : result;
        }


}
