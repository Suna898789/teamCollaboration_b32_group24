package week6.hasnae;

public class Array_FindMaximum_hasnae {
    public static void main(String[] args) {

        int[] array = {99, 12, 23, 32, 44, 57, 6};
        int max = findMax(array);
        System.out.println("max = " + max);

    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int each : array) {
            if (each >= max) {
                max = each;
            }
        }
        return max;
    }
}
/*
5️⃣
 Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */