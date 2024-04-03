package week7.nesli;

import java.util.Arrays;

public class SortDescending2 {

    public static int[] arrSortInDescending(int[] arr) {
        boolean swapped;
        int length = arr.length;

        do {
            swapped = false;
            for (int i = 1; i < length; i++) {
                swapped = (arr[i - 1] < arr[i]) ? swap(arr, i - 1, i) : swapped;
            }
            length--; // Decrease the range of comparison as the largest element gets placed at the end
        } while (swapped);

        System.out.println(Arrays.toString(arr));

        return arr;
    }

    private static boolean swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        arrSortInDescending(arr);
    }

}
