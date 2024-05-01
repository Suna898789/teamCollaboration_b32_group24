//** created by Maryam 


package src.week10.meryem;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_sortingInAsc_meryem {

    /*
    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 7 numbers");
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
