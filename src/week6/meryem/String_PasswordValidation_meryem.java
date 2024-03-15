//** created by Maryam 


package week6.meryem;

public class String_PasswordValidation_meryem {

    public static void main(String[] args) {
        String password = "Password@123";
        boolean isValid = validatePassword(password);
        System.out.println("Is password valid? " + isValid);
    }

    public static boolean validatePassword(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one upper-case letter, one lower-case letter,
        // one special character, and one digit
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (isSpecialChar(c)) {
                hasSpecialChar = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    // Helper method to check if a character is a special character
    private static boolean isSpecialChar(char c) {
        String specialCharacters = "!@#$%^&*()-+=_{}[]|:;<>,.?/~";
        return specialCharacters.contains(Character.toString(c));
    }

}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */