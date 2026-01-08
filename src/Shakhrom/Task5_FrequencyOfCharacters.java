package Shakhrom;

public class Task5_FrequencyOfCharacters {

    public static String frequencyOfChars(String str) {
        String result = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (checked.contains("" + ch)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            result += ch + "" + count;
            checked += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // A3B2C1D2
    }


}

 /*
    Write a return method that can find the frequency of character
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
