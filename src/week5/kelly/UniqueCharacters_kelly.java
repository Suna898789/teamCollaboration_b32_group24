package week5.kelly;

import java.util.Scanner;

public class UniqueCharacters_kelly {
    public static void main(String[] args) {

        uniqueCharacters();

    }


    public static void uniqueCharacters() {

        System.out.println("Enter your string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        while (str.isEmpty() || str.isBlank()) {
            System.out.println("Invalid String");
            System.out.println("Enter a string");
            input = new Scanner(System.in);
            str = input.nextLine();

        }


        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }


        }
        System.out.println("unique = " + unique);



        input.close();
    }

}
