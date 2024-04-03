//** created by Maryam 


package src.week7.meryem;

public class FindMinimum_meryem {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int minimumNumber = findMinimum(arr);
        System.out.println("Minimum number in the array: " + minimumNumber);
    }


    public static int findMinimum(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }


}

/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */