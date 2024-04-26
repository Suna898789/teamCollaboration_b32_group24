//** created by Maryam 


package week9.meryem;

import java.util.Arrays;

public class Array_concat2Arrays_meryem {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = concatenateArrays(arr1, arr2);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] concatenatedArray = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, concatenatedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, concatenatedArray, arr1.length, arr2.length);

        return concatenatedArray;
    }

}
/*
Write a return method that can concatenate two arrays
 */