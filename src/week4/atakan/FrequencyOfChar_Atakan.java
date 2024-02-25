package week4.atakan;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar_Atakan {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = frequencyOfChars(input);
        System.out.println(result);
    }

    public static String frequencyOfChars(String input) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Iterate through the characters of the input string
        for (char c : input.toCharArray()) {
            // Increment the count if character is already in the map
            // Otherwise, add it with count 1
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Create a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        // Iterate through the map to build the result string
        charFrequency.forEach((key, value) -> result.append(key).append(value));

        return result.toString();
    }
}