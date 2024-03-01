package week1.elmehdi;

public class OddEven_elmehdi {
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int inputNumber = 10; // Replace with your desired number
        String result = checkEvenOdd(inputNumber);
        System.out.println("The given number is " + result + ".");
    }
}
