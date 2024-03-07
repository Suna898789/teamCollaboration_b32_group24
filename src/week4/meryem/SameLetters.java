//** created by Maryam 


package src.week4.meryem;

import java.util.Arrays;

public class SameLetters {


    public static void main(String[] args) {
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }

    public static boolean same(String str1, String str2) {
        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */