//** created by Maryam 


package src.week7.meryem;

public class SortAscending_meryem {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sort(arr);

        // Displaying sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static int[] sort(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        // Implementing Selection Sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }


}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */