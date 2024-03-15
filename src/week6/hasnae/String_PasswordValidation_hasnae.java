package week6.hasnae;

import java.util.Scanner;

public class String_PasswordValidation_hasnae {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        String password = input.nextLine();
        Boolean isValidPassword = validPassword(password);
        System.out.println("isValidPassword = " + isValidPassword);
    }

    public static boolean validPassword(String password) {


        password.trim();

        if (password.length() < 6) {
            return false;
        }

        char[] array = password.toCharArray();

        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsSpecialChar = false;
        boolean containsDigit = false;


        for (char eachCharacter : array) {

// I used ASCII Table to determine UpperCase LowerCase letters, Digit and Special Characters

            if (eachCharacter >= 65 && eachCharacter <= 90) {
                containsUpperCase = true;

            } else if (eachCharacter >= 97 && eachCharacter <= 122) {
                containsLowerCase = true;

            } else if (eachCharacter >= 48 && eachCharacter <= 57) {
                containsDigit = true;

            } else if ((eachCharacter >= 33 && eachCharacter <= 47) || (eachCharacter >= 58 && eachCharacter <= 64) || (eachCharacter >= 91 && eachCharacter <= 96) || (eachCharacter >= 123 && eachCharacter <= 127)) {
                containsSpecialChar = true;


            }
        }
        return containsUpperCase && containsLowerCase && containsDigit && containsSpecialChar;
    }
}




/*
2️⃣
  String_PasswordValidation
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */


