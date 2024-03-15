//** created by Maryam 


package src.week6.meryem;

public class Array_FindMaximum_meryem {


    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int max = findMax(arr);
        System.out.println("Maximum number: " + max);
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {

            return Integer.MIN_VALUE;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */