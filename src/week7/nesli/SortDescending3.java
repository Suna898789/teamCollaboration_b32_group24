package week7.nesli;

import java.util.Arrays;

public class SortDescending3 {

    /**
     * arrSortInDescending() method uses the Selection Sort algorithm to sort the array in descending order.
     * The Selection Sort algorithm divides the array into two parts: sorted and unsorted.
     * It iterates through the array, finding the index of the maximum element in each iteration
     * and swapping it with the current element if necessary.
     * In each iteration, it finds the maximum element in the unsorted part and swaps it with the last element of the sorted part.
     * This process continues until the entire array is sorted.
     * After the loop completes, the array is sorted in descending order, and the sorted array is returned.
     * @param arr
     * @return
     */

    public static int[] arrSortInDescending(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = arrSortInDescending(arr);

        System.out.println("arr = " + Arrays.toString(arr));

    }

}

/*
Initial Array: {10, 20, 7, 8, 90}

*** Iteration 1 (i = 0):

Inner loop (j = 1 to 4): j = 1

Compare arr[1] (20) with arr[maxIndex] (10)
Update maxIndex to 1 (since 20 > 10)
Swap arr[0] (10) with arr[maxIndex] (20)

---> Array after iteration 1: {20, 10, 7, 8, 90}

*** Iteration 2 (i = 1):

Inner loop (j = 2 to 4): j = 2

Compare arr[2] (7) with arr[maxIndex] (10)
No update to maxIndex as 7 < 10
Inner loop (j = 3 to 4): j = 3

Compare arr[3] (8) with arr[maxIndex] (10)
No update to maxIndex as 8 < 10
Inner loop (j = 4 to 4): j = 4

Compare arr[4] (90) with arr[maxIndex] (10)
Update maxIndex to 4 (since 90 > 10)
Swap arr[1] (10) with arr[maxIndex] (90)

---> Array after iteration 2: {20, 90, 7, 8, 10}

*** Iteration 3 (i = 2):

Inner loop (j = 3 to 4): j = 3

Compare arr[3] (8) with arr[maxIndex] (7)
Update maxIndex to 3 (since 8 > 7)
Inner loop (j = 4 to 4): j = 4

Compare arr[4] (10) with arr[maxIndex] (7)
No update to maxIndex as 10 < 7
Swap arr[2] (7) with arr[maxIndex] (8)

---> Array after iteration 3: {20, 90, 8, 7, 10}

*** Iteration 4 (i = 3):

Inner loop (j = 4 to 4): j = 4

Compare arr[4] (10) with arr[maxIndex] (7)
Update maxIndex to 4 (since 10 > 7)
Swap arr[3] (7) with arr[maxIndex] (10)

---> Array after iteration 4: {20, 90, 8, 10, 7}

*** Iteration 5 (i = 4, last iteration, no swaps needed):

Inner loop (j = 5 to 5): No iterations because j < n is not satisfied
Final Sorted Array: {90, 20, 10, 8, 7}

Each iteration of the outer loop (i) corresponds to finding the maximum element in the remaining unsorted part
of the array and swapping it with the last element of the sorted part.
This process repeats until the entire array is sorted in descending order.

 */
