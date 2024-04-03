package week7.nesli;

import java.util.Arrays;

public class SortDescending {

    public static int[] arrSortInDescending (int[] arr){

        boolean swapped;
        int length = arr.length;

        do{
            swapped = false;
            for(int i = 1; i < length; i++){
                if(arr[i-1] < arr[i]){
                    int temporary = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temporary;
                    swapped = true;
                }
            }
            length --; // Decrease the range of comparison (the length of the array) as the largest element gets placed at the end
        } while (swapped);


        System.out.println(Arrays.toString(arr));

        return arr;

    }

    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};

        arrSortInDescending(arr);



    }

}

/*
SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
