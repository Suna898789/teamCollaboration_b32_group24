package week5.hasnae;

import java.util.Scanner;

public class ReverseString_hasnae {
    public static void main(String[] args) {

        reverseString();


    }


    public static void reverseString() {
        System.out.println("Enter your string");

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        while (str.isEmpty() || str.isBlank()) {
            System.out.println("Invalid String");
            System.out.println("Enter a string");
            input = new Scanner(System.in);
            str = input.nextLine();


            String reverse="";

            for (int i = str.length() - 1; i >= 0; i--) {
                char each = str.charAt(i);
               reverse += each;
            }

            System.out.println("reverse = " + reverse);

        }


    }
}



/*
String_Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */