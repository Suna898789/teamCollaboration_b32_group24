//** created by Maryam 


package src.week5.meryem;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class String_UniqueCharacters_meryem {

    public static void main(String[] args) {


        String str = "AAABBBCCCDEF";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // first, we need to find the frequency of each character

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            // creat a condition to check if the character is unique

            if (frequency == 1) map.put(each.charAt(0), frequency);

        }


        System.out.println(map);

    }


}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */