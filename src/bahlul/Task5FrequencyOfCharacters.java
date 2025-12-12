package bahlul;

public class Task5FrequencyOfCharacters {

     /*
    Write a return method that can find the frequency of character
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2



     */

    public static void main(String[] args) {

        String example = "srtiemcuddass";

        String string = frequencyOfChars(example);

        System.out.println(string);


    }


    public static String frequencyOfChars(String str){

        /*

        aRgtiyy


char[]chars = chars.toCharArray();


Arrays.sort(chars);



for(i=0;i<chars.length;i++)
        if(chars[i]==


         */

            StringBuilder result = new StringBuilder();
            java.util.LinkedHashMap<Character, Integer> map = new java.util.LinkedHashMap<>();

            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (var entry : map.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

            return result.toString();


    }

}
