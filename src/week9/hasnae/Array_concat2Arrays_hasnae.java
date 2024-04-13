package week9.hasnae;

import java.util.Arrays;

public class Array_concat2Arrays_hasnae {
    public static void main(String[] args) {
        // Two arrays to concatenate
        char[] array1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] array2 = {'h', 'i', 'j', 'k', 'l','m', 'n', 'o'};

        // Concatenate arrays
        char[] concatenatedArray = concatenateArrays(array1, array2);

        // Print the concatenated array
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }

    public static char[] concatenateArrays(char[] a, char[] b) {
        int length = a.length + b.length;
        char[] result = new char[length];

        // Copy elements of array a
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        // Copy elements of array b
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

}
