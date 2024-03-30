package week8.hasnae;

import java.util.Arrays;

public class Array_N_uniqueIntegers_SumUpToZero_hasnae {

    public static int[] N_UniqueIntegers_sumUpToZero(int N) {
        if (N < 2 || N >= 100) {
            throw new IllegalArgumentException("Invalid number!!!! Number should be between 2 and 99 (inclusive");
        }

        // Initialize an array to store the unique integers
        int[] result = new int[N];
        int sum_except_last = 0;

        // Generate N-1 positive integers
        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;
            sum_except_last += result[i];
        }

        // Add the negative sum of the positive integers to make the total sum 0
        result[N - 1] = -sum_except_last;

        return result;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] uniqueIntegers = N_UniqueIntegers_sumUpToZero(N);
        System.out.println(N + " unique integers that sum up to 0: " + Arrays.toString(uniqueIntegers));
    }
}



/*
--> Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
 The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */