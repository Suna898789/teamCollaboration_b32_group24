package week7.nesli;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimum {

    public static int[] createIntArrayFromUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        return arr;
    }

    public static int[] createIntArrayFromUserInputWithCommas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of integer numbers separated by commas: ");
        String input = scanner.nextLine();

        String[] numbersAsString = input.split(",");
        int[] arr = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            arr[i] = Integer.parseInt(numbersAsString[i].trim());
        }

        scanner.close();

        return arr;
    }

    public static int findMinimumIntFromArray (int[] arr){

        int minimumInt = 2147483647;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minimumInt){
                minimumInt = arr[i];
            }

        }

        return minimumInt;
    }


    public static void main(String[] args) {

        // int[] arr = {99, 12, 23, 32, 44, 57, 6}

        /*
        int[] userArray = createIntArrayFromUserInput();
        System.out.println("userArray = " + Arrays.toString(userArray));

        int minimumInt = findMinimumIntFromArray(userArray);
        System.out.println("minimumInt = " + minimumInt);
         */

        int[] userArray2 = createIntArrayFromUserInputWithCommas();
        System.out.println("userArray2 = " + Arrays.toString(userArray2));

        int minimumInt2 = findMinimumIntFromArray(userArray2);
        System.out.println("minimumInt2 = " + minimumInt2);


    }


}

