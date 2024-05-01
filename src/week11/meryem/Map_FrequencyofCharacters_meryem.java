//** created by Maryam 


package src.week11.meryem;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyofCharacters_meryem {



    public static void main(String[] args) {

        //  Write a method that prints the frequency of each character from a String.

        String str = "AAABBBCCCDEF";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
