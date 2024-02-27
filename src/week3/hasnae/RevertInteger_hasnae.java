package week3.hasnae;

public class RevertInteger_hasnae {

    //First approach

    /*
    public static int revertNegativeNumber(int number) {
        while (number >= 0) {
            throw new ArithmeticException("Invalid Number: Enter negative number");
        }

        return Math.abs(number);
    }*/


    //Second Approach

    public static int revertNumber(int num) {
        if (num < 0) {
            return -num; // Negate the negative value to get the positive magnitude
        } else {
            return num; // Positive value remains unchanged
        }
    }


    public static void main(String[] args) {

        System.out.println(revertNumber(6));

    }
}

