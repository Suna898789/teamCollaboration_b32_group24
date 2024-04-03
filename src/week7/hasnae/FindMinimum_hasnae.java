package week7.hasnae;

public class FindMinimum_hasnae {
    public static void main(String[] args) {


        int[] array = {99, 12, 23, 32, 44, 57, 6};
        int min = findMin(array);
        System.out.println("min = " + min);

    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int each : array) {
            if (each <= min) {
                min = each;
            }
        }
        return min;
    }






}
/*
️⃣1. FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */