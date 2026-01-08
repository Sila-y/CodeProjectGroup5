package Shakhrom;
import java.util.*;

public class Task6_FindTheUnique {


    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF")); // DEF
    }



    public static String unique(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();


        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }

}

  /*
    String -- Find the unique
    Write a return method that can find thw unique characters from the String
    Ex: unique("AAABBBCCCDEF") ===> "DEF";

    write the code in .txt file. Better for interview
     */
