package week4.atakan;

import java.util.Arrays;

public class SameLetters_Atakan {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));  // true

        String str3 = "abc";
        String str4 = "abb";
        System.out.println(same(str3, str4));  // false
    }

    public static boolean same(String str1, String str2) {
        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

