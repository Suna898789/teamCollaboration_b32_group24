package week8.hasnae;

import java.util.Arrays;

public class MoveZerosToTheEnd_hasnae {
    public static void main(String[] args) {

        int[] array = new int[]{1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToTheEnd(array);


    }

    public static void moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int index = 0;
        for (int each : array) {
            if (each != 0) {
                result[index++] = each;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}

/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */