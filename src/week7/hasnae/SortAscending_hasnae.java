package week7.hasnae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAscending_hasnae {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        ascendantSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static int[] ascendantSort(int[] array) {

        Arrays.sort(array);


        return array;
    }


}
/*
️2.  SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */