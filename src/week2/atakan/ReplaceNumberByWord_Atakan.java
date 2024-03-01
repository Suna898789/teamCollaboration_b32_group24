package week2.atakan;

public class ReplaceNumberByWord_Atakan {

    public static void main(String[] args) {
        printSpecialNumbers(15); // Change 15 to any positive integer N
    }

    public static void printSpecialNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder result = new StringBuilder();
            if (i % 2 == 0) {
                result.append("Codility");
            }
            if (i % 3 == 0) {
                result.append("Test");
            }
            if (i % 5 == 0) {
                result.append("Coders");
            }
            if (result.length() == 0) {
                // If the number is not divisible by 2, 3, or 5, just print the number
                System.out.println(i);
            } else {
                // If the number is divisible by 2, 3, or 5, print the concatenated string
                System.out.println(result.toString());
            }
        }
    }
}

