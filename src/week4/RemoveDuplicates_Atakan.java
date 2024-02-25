package week4;

import java.util.LinkedHashSet;

public class RemoveDuplicates_Atakan {
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result);  // Output: ABC
    }

    public static String removeDup(String input) {
        // Convert the String to a LinkedHashSet (removes duplicates automatically)
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Add all characters from the input String to the set
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }

        // Convert the LinkedHashSet back to a String
        StringBuilder output = new StringBuilder();
        for (Character ch : set) {
            output.append(ch);
        }

        return output.toString();
    }
}

