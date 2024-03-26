package week7.nesli;

import java.util.Arrays;

public class SortAscending {

    public static int[] arrSortInAscending (int[] arr){

        boolean swapped;
        int length = arr.length;

        do{
            swapped = false;
            for(int i = 1; i < length; i++){
                if(arr[i-1] > arr[i]){
                    int temporary = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temporary;
                    swapped = true;
                }
            }
            length --; // Decrease the range of comparison (the length of the array) as the largest element gets placed at the end
        } while (swapped);


        System.out.println(Arrays.toString(arr));

        return arr;

    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        arrSortInAscending(arr);



    }

}

/**
 * do-while loop -> repeatedly compares adjacent elements and swap them if they are in the wrong order until no swaps are needed (indicating the array is sorted):
 *
 * Setup:
 * boolean variable swapped = false -> This variable keeps track of whether any swaps were made during a pass through the array.
 * n = the length of the array -> to indicate the range of elements we need to compare
 *
 * Main Sorting Logic:
 * Inside the do-while loop, we have a for loop that iterates from index 1 to n - 1. This loop compares adjacent elements in the array.
 * If an element at index i - 1 is greater than the element at index i, it means they are in the wrong order. In this case, we swap these elements.
 * After swapping, we set swapped to true to indicate that at least one swap occurred during this pass through the array.
 *
 * Loop Continuation Condition:
 * After completing one pass through the array, we decrement n by 1. This is because, after each pass, the largest element is guaranteed
 * to be at the end of the array (if sorting in ascending order). So, we don't need to compare the last element in subsequent passes.
 * The do-while loop continues as long as swapped is true, meaning at least one swap occurred during the previous pass.
 *
 * Sorting Completion:
 * When no swaps occur during a pass through the array, it means the array is sorted.
 * At this point, swapped remains false, so the do-while loop terminates, and the sorted array is returned.
 *
 * The do-while loop ensures that the sorting process continues until the array is fully sorted.
 * The loop iterates through the array, performing swaps as needed to move larger elements towards the end of the array,
 * and it continues this process until no more swaps are necessary, indicating that the array is sorted.
 */

/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
