//** created by Maryam 


package src.week3.meryem;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scr.nextInt();
        scr.close();


        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
