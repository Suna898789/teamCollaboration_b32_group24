package week1.nesli;

import java.util.Scanner;

public class Identify {
    public static void main(String[] args) {

        //Below program keeps asking to user to "Enter a number: ":

        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.print("Enter a number: ");
            while (!scanner.hasNextInt()) {
                //scanner.hasNextInt() -> returns true if the next scanner input is an int value
                System.out.println("Invalid input. Please enter a valid integer: ");
                scanner.next(); //Finds and returns the next complete token from this scanner;
                //to discard(consume) any non-integer input, allowing the program to prompt(ask)
                //the user again for a valid integer.
            }
            userNumber = scanner.nextInt();
            String result = identify(userNumber);
            System.out.println("Result: " + result);
        } while (true);

        // scanner.close(); // Not closing scanner for continuous input
    }

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
