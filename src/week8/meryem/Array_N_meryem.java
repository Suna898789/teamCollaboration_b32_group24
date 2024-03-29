//** created by Maryam 


package src.week8.meryem;

import java.util.HashSet;
import java.util.Set;

public class Array_N_meryem {


    public static void main(String[] args) {
        int N = 4;
        int[] array = generateArray(N);

        // Displaying the generated array
        System.out.println("Generated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


    public static int[] generateArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N must be between 1 and 99 (exclusive)");
        }

        int[] result = new int[N];

        // Generate random unique integers that sum up to 0
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            int num;
            do {
                num = (int) (Math.random() * N * 10) - N * 5; // Generate random number in range [-N*5, N*5)
            } while (set.contains(num));
            set.add(num);
            result[i] = num;
            sum += num;
        }
        result[N - 1] = -sum;

        return result;
    }

}
/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
 */