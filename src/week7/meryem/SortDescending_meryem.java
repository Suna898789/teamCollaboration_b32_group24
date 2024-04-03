//** created by Maryam 


package src.week7.meryem;

public class SortDescending_meryem {

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);

        // Displaying sorted array
        System.out.print("Sorted array in descending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public static int[] sortDescending(int[] arr) {
        // Check if the array is empty or has only one element
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        // Implementing Selection Sort algorithm in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap arr[i] and arr[maxIndex]
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }


}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */