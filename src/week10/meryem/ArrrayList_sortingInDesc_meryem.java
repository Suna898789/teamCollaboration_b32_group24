//** created by Maryam 


package src.week10.meryem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrrayList_sortingInDesc_meryem {

    //  Write a method that can sort the ArrayList in Descending order without using the sort method.
    public static void descendingSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap adjacent elements if they are in the wrong order
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
        public static void main (String[]args){

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(3);
            numbers.add(8);
            numbers.add(1);
            numbers.add(2);

            System.out.println("Before sorting: " + numbers);
            descendingSort(numbers);
            System.out.println("After sorting in descending order: " + numbers);



        }
    }
